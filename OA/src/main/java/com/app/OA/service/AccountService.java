package com.app.OA.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.OA.dao.AccountDao;
import com.app.OA.domain.BookPatient;
import com.app.OA.domain.Entity;
import com.app.OA.domain.User;

@Component
public class AccountService {

	public final static String SESSION_KEY = "user";
	
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
	@Autowired
	AccountDao accountDao;

	//获取当前时间
	public String getTime(){
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		
		return sdf.format(date);
	}
	
	
	/**
	 * 登录
	 * @param usermessage 前台传来的登录信息
	 * @param session 
	 * @return
	 * @throws ParseException
	 */
//	@Cacheable(value = "user", key = "'user_'+#username")
	public Entity login(User usermessage, HttpServletRequest request ) throws ParseException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(1800);//半小时1800
		String loginTime = getTime();
		Entity entity =new Entity();
		User user=accountDao.selectOneUser(usermessage.getName());
		if(user ==null){
			entity.setMessage("该账号不存在");
			entity.setSuccess(false);
			return entity;
		}
		if(user.getPassWard().equals(usermessage.getPassWard())){
			
			if(user.getStatus() == 1 && usermessage.getStatus() == 1){
				accountDao.updateLoginTime(loginTime,usermessage.getName());
				user=accountDao.selectOneUser(usermessage.getName());
				session.setAttribute(SESSION_KEY, usermessage.getName());
				redisTemplate.opsForValue().getAndSet(usermessage.getName(), session.getId());
				entity.setResult(user);	
				entity.setMessage("强制登录成功");
				entity.setSuccess(true);
			}else if(user.getStatus() == 1 && usermessage.getStatus() == 0){
					entity.setMessage("该账户已登录");
					entity.setResult("1");	
					entity.setSuccess(false);
			}else{
				accountDao.updateLoginTime(loginTime,usermessage.getName());
				user=accountDao.selectOneUser(usermessage.getName());//获得用户信息
				session.setAttribute(SESSION_KEY, usermessage.getName());
				redisTemplate.opsForValue().getAndSet(usermessage.getName(), session.getId());
				entity.setResult(user);	
				entity.setMessage("登录成功");
				entity.setSuccess(true);
			}
			
		}else{
			entity.setMessage("账户或密码错误");
			entity.setSuccess(false);
		}
		
		return entity;
		
		
	}

	/**
	 * 注册
	 * @param user
	 * @return
	 */
	@Transactional
	public boolean register(User user) {
		String loginTime=getTime();
		String id=UUID.randomUUID().toString().replace("-", "");
		user.setCreateTime(loginTime);
		user.setGuid(id);
		
		try {
			if(user.getName() != null && user.getRoleGrade() != null){
				boolean check = checkName(user);
				if(check){
				accountDao.register(user);
				accountDao.addLog(user.getRoleName(),loginTime,"新增用户: "+user.getName());//记录日志
				}else{
					return false;
				}
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

		return true;
	}

	/**
	 * 退出登录
	 * @param user 
	 * @param session
	 */
	public void logout(User user, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String logoutTime = getTime();
		redisTemplate.delete(session.getAttribute(SESSION_KEY).toString());
		session.removeAttribute(SESSION_KEY);
		accountDao.logout(user.getName(),logoutTime);
	}

	
	/**
	 * 修改管理员个人信息
	 * @param user
	 * @param session
	 */
	@Transactional
	public boolean modify(User user) {
		String updateTime = getTime();
		user.setUpdateTime(updateTime);
		if(user.getRoleGrade() == 1){
			accountDao.addLog(user.getGuid(),updateTime,"试图修改个人信息: "+user.getName() +" 为超级管理员");//记录日志
			return false;
		}else {
			accountDao.modify(user);
			accountDao.addLog(user.getGuid(),updateTime,"修改个人信息: "+user.getName());//记录日志
		}

		return true;
	}
	

	/**
	 * 获取所有管理员
	 *
	 * @return
	 */
	public List<User> queryAllUser(User user) {
		Integer start = 0;
		if(user.getUserSex() !=null){
			start = (user.getId()-1)*user.getUserSex();
			
		}else{
			user.setUserSex(20);
		}
		user.setId(start);
		return accountDao.queryAllUser(user);
	}

	/**
	 * 验证是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkPower(String administrators) {
		 
		Integer roleNum = accountDao.checkPower(administrators);
		
		String power = accountDao.getUserPower(roleNum);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("1")){
				return true;
			}
		}
		return false;
	}
	/**
	 * 验证是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkRole(String administrators) {
		 
		Integer roleNum = accountDao.checkPower(administrators);
		
		String power = accountDao.getUserPower(roleNum);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("2")){
				return true;
			}
		}
		return false;
	}
	/**
	 * 验证是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkPowerAndRole(String administrators) {
		 
		Integer roleNum = accountDao.checkPower(administrators);
		
		String power = accountDao.getUserPower(roleNum);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("1")){
				return true;
			}
			if(powerNum.equals("2")){
				return true;
			}
		}
		return false;
	}
	/**
	 * 验证是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkPower(Integer id) {
		 
		String power = accountDao.getUserPower(id);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("1")){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 验证角色是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkRolePower(Integer id) {
		 
		String power = accountDao.getUserPower(id);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("1")){
				return true;
			}
			if(powerNum.equals("2")){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 验证角色是否是管理员并且拥有权限
	 *
	 * @return
	 */
	public boolean checkRole(Integer id) {
		 
		String power = accountDao.getUserPower(id);
		String[] powerNums = power.split(",");
		for (String powerNum : powerNums) {
			if(powerNum.equals("2")){
				return true;
			}
		}
		return false;
	}

	/**
	 * 删除管理员
	 * @param name 用户名
	 * @return
	 */
	@Transactional
	public void delete(User user) {
		String logoutTime = getTime();
		accountDao.delete(user.getUserName());
		accountDao.addLog(user.getName(),logoutTime,"删除用户: "+user.getUserName());//记录日志
	}

	/**
	 * 获取管理员个人信息
	 * @return
	 */
	public User getUser(String name) {
		User user = new User();
			user = accountDao.getUser(name);
		return user;
	}

	/**
	 * 获取预约挂号列表
	 * @param user
	 * @return
	 */
	public List<BookPatient> getBookList(User user) {
		Integer start = 0;
		if(user.getUserSex() !=null){
			start = (user.getId()-1)*user.getUserSex();
			
		}else{
			user.setUserSex(20);
		}
		user.setId(start);
		List<BookPatient> userList = accountDao.getBookList(user);
		for (BookPatient bookPatient : userList) {
			String a = bookPatient.getIdentityCard().replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
			String b =bookPatient.getPatientPhone().replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
			bookPatient.setIdentityCard(a);
			bookPatient.setPatientPhone(b);
		}
		return userList;
	}

	/**
	 * 获取预约挂号列表总条数
	 * @param user
	 * @return
	 */
	public Integer getBookListCount(User user) {
		return accountDao.getBookListCount(user);
	}

	/**
	 * 验证管理员账户名是否存在
	 * @param user
	 * @return
	 */
	public boolean checkName(User user) {
		int count = 0;
		count = accountDao.checkName(user);
		if(count != 0){
			return false;
		}else{
			return true;
		}
		
	}

	/**
	 * 清空登录状态
	 * @param user
	 * @return
	 */
	public void clearStatus(String name) {
		
		accountDao.clearStatus(name);
		
	}

	/**
	 * 查询所有管理员总数
	 * @return
	 */
	public Integer queryAllUserCount(User user) {
		return accountDao.queryAllUserCount(user);
	}

	/**
	 * 获取用户
	 * @param user
	 * @return
	 */
	public List<User> getWechat(User user) {
		Integer start = 0;
		if(user.getUserSex() !=null){
			start = (user.getId()-1)*user.getUserSex();
			
		}else{
			user.setUserSex(20);
		}
		user.setId(start);
		List<User> userList =accountDao.getWechat(user);
		for (User user2 : userList) {
			String a = user2.getUserBoth().replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
			String b =user2.getUserPhone().replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
			user2.setUserBoth(a);
			user2.setUserPhone(b);
		}
		
		
		return userList;
	}
	
	/**
	 * 获取用户总数
	 * @return
	 */
	public Integer getWechatCount(User user) {
		return accountDao.getWechatCount(user);
	}
	
	/**
	 * 获取日志信息
	 * @param user
	 * @return
	 */
	public List<User> getLogin(User user) {
		Integer start = 0;
		if(user.getUserSex() !=null){
			start = (user.getId()-1)*user.getUserSex();
			
		}else{
			user.setUserSex(20);
		}
		user.setId(start);
		return accountDao.getLogin(user);
	}
	
	/**
	 * 获取日志信息总数
	 * @return
	 */
	public Integer getLoginCount(User user) {
		return accountDao.getLoginCount(user);
	}
	
	/**
	 * 定时删除日志
	 * @return
	 */
	public void deleteLogByTime(String loginTime) {
		 accountDao.deleteLogByTime(loginTime);
	}
	
	
}
