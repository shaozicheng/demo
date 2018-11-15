package com.app.OA.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.OA.domain.BookPatient;
import com.app.OA.domain.Entity;
import com.app.OA.domain.User;
import com.app.OA.service.AccountService;
import com.app.OA.AES.anno.Decrypt;
import com.app.OA.AES.anno.Encrypt;


/***
 * 账号管理
 * @author 邵子城 2018/7/30
 *
 */

@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountController {

	final static Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	AccountService accountService;
	
	/**
	 * 登录
	 * @param user
	 * @param session
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/login")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity login(@RequestBody User user ,HttpServletRequest request, HttpServletResponse response) throws ParseException{
		Entity entity= new Entity();
		try {
			entity = accountService.login(user,request); 

		} catch (Exception e) {
			entity.setMessage("登陆失败");
			entity.setSuccess(false);
		}
     	
		return entity;
	}

	/**
	 * 注册
	 * @param user 新注册用户
	 * @return
	 */
	@RequestMapping("/register")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity register(@RequestBody User user){
		Entity entity =new Entity();
		try {
			boolean bl=accountService.register(user);
			if(bl){
				entity.setMessage("添加成功");
				entity.setSuccess(true);
			}else{
				entity.setMessage("添加失败");
				entity.setSuccess(false);
			}
			
		} catch (Exception e) {
			entity.setMessage("添加失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 退出登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/logout")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity logout(@RequestBody User user,HttpServletRequest request){
		Entity entity =new Entity();
		try {
			accountService.logout(user,request);
			entity.setMessage("退出成功");
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setMessage("退出失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 修改用户信息
	 * @return
	 */
	@RequestMapping("/modify")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity modify(@RequestBody User user  ){
		Entity entity =new Entity();
		//验证权限
		try {
			boolean result = false;
			
			boolean check = accountService.checkPower(user.getGuid());
			boolean check2= accountService.checkRole(user.getGuid());
			boolean userPower = accountService.checkPower(user.getName());
			boolean userPower2 = accountService.checkRole(user.getName());
			
			
//			boolean check1= accountService.checkPowerAndRole(user.getGuid());//获取修改人权限等级
//			boolean check2= accountService.checkPower();//获取被修改人权限等级
			
			
			if((check && !userPower ) ||(check2 && !userPower && !userPower2)){
				result=accountService.modify(user);
			}
			 
			if(result){
				 entity.setMessage("修改成功");
				 entity.setSuccess(true);
			 }else{
				 entity.setMessage("修改失败");
				 entity.setSuccess(false);
			 }
			
		} catch (Exception e) {
			entity.setMessage("修改失败");
			e.printStackTrace();
			entity.setSuccess(false);
		}
		 
		return entity;
	}
	
	
	/**
	 * 查询所有管理员(管理员模式下才有)
	 * @return
	 */
	@RequestMapping("/queryalluser")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity queryAllUser(@RequestBody User user ){
		Entity entity =new Entity();
		try {
			List<User> users=accountService.queryAllUser(user);
			Integer count =  accountService.queryAllUserCount(user);
			entity.setResult(users);
			entity.setSuccess(true);
			entity.setTotal(count);
			entity.setMessage("查询成功");
		} catch (Exception e) {
			entity.setMessage("查询失败");
			entity.setSuccess(false);
		}
		
		
		return entity;
	}
	
	/**
	 * 删除指定用户(管理员模式下才有)
	 * @return
	 */
	@RequestMapping("/delete")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity delete(@RequestBody User user){
		Entity entity =new Entity();
		try {
			if(user.getRoleGrade() == 1  ){
				entity.setMessage("无法删除");
				entity.setSuccess(false);
				return entity;
			}
			//验证权限
			boolean check1= accountService.checkPower(user.getName());
			boolean check2= accountService.checkRole(user.getName());
			boolean checked= accountService.checkRole(user.getUserName());
			if(check1 || (check2 && !checked )){
				accountService.delete(user);
				entity.setSuccess(true);
			}else{
				entity.setMessage("账户权限不足");
				entity.setSuccess(false);
			}
		} catch (Exception e) {
			entity.setMessage("删除失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 获取用户个人信息
	 * @return
	 */
	@RequestMapping("/getuser")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getUser(@RequestBody User user ){
		Entity entity = new Entity();
		try {
			User userData = accountService.getUser(user.getName());
			entity.setResult(userData);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setMessage("信息获取失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 获取预约挂号列表
	 * @param user
	 * @return
	 */
	@RequestMapping("/getbooklist")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getBookList(@RequestBody User user ){
		Entity entity = new Entity();
		try {
			List<BookPatient> bookPatientList =  accountService.getBookList(user);
			Integer count =  accountService.getBookListCount(user);//获取预约挂号列表总条数
			entity.setSuccess(true);
			entity.setResult(bookPatientList);
			entity.setTotal(count);
		} catch (Exception e) {
			entity.setMessage("获取失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 验证账户名是否存在
	 * @param user
	 * @return
	 */
	@RequestMapping("/checkname")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkName(@RequestBody User user ){
		Entity entity = new Entity();
		try {
			boolean check = accountService.checkName(user);
			
			if(check){
				entity.setSuccess(true);
			}else{
				entity.setMessage("该账户名已存在");
				entity.setSuccess(false);
			}
			
		} catch (Exception e) {
			entity.setSuccess(false);
			e.printStackTrace();
		}
		
		return entity;
	}
	
	/**
	 * 获取用户
	 * @param user
	 * @return
	 */
	@RequestMapping("/getwechat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getWechat(@RequestBody User user ){
		Entity entity =new Entity();
		try {
			List<User> users = accountService.getWechat(user);
			Integer count =  accountService.getWechatCount(user);
			entity.setResult(users);
			entity.setSuccess(true);
			entity.setTotal(count);
			
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("获取失败");
		}
		
		return entity;
	}
	
	/**
	 * 获取日志信息
	 * 
	 * @return
	 */
	@RequestMapping("/getlogin")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getLogin(@RequestBody User user ){
		Entity entity =new Entity();
		try {
			List<User> users = accountService.getLogin(user);
			Integer count =  accountService.getLoginCount(user);
			entity.setResult(users);
			entity.setSuccess(true);
			entity.setTotal(count);
		} catch (Exception e) {
			entity.setMessage("获取失败");
			entity.setSuccess(false);
		}
		return entity;
	}
	
}
