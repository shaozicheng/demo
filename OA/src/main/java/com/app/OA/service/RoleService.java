package com.app.OA.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.app.OA.dao.AccountDao;
import com.app.OA.dao.RoleDao;
import com.app.OA.domain.Role;
import com.app.OA.domain.User;

@Component
public class RoleService {

	@Autowired
	RoleDao roleDao;
	
	@Autowired
	AccountDao accountDao;

	//获取当前时间
	public String getTime(){
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		
		return sdf.format(date);
	}
	
	/**
	 * 增加角色
	 * @param Role 新增权限相关信息
	 * @return
	 */
	@Transactional
	public void add(Role role) {
		String createTime = getTime();
		role.setCreateTime(createTime);
		roleDao.add(role);
		accountDao.addLog(role.getCreateUser(),createTime,"新增角色: "+role.getRoleName());//记录日志
	}

	/**
	 * 删除角色
	 * @param name
	 * @return
	 */
	@Transactional
	public void delete(User user) {
		String updateTime = getTime();
		roleDao.updateUser(user.getId());//将拥有该删除角色的用户的角色统一更改为普通角色
		roleDao.delete(user.getId());
		accountDao.addLog(user.getUserName(),updateTime,"删除角色: "+user.getRoleName());//记录日志
	}
	
	/**
	 * 修改角色
	 * @param Role 要修改的权限内容
	 * @return
	 */
	@Transactional
	public void update(Role role) {
		String updateTime = getTime();
		role.setUpdateTime(updateTime);
		if(role.getPowerGrade().equals("1")){
			accountDao.addLog(role.getUpdateUser(),updateTime,"试图修改角色: "+role.getRoleName()+" 为超级管理员");//记录日志
		}else{
			roleDao.update(role);
			accountDao.addLog(role.getUpdateUser(),updateTime,"修改角色: "+role.getRoleName());//记录日志
		}
		
	}

	/**
	 * 查询角色
	 * @param 
	 * @return
	 */
	public List<Role> selectAll() {

		List<Role> roles = roleDao.selectAll();
		for (Role role : roles) {
			String [] powers = role.getPowerGrade().split(",");
			StringBuffer powerNames = new StringBuffer();
			for (String power : powers) {
				String name = roleDao.getRoleName(Integer.parseInt(power));
				powerNames.append(","+name);
			}
			;
			role.setPowerGradeName(powerNames.replace(0, 1, "").toString());
			
		}
		
		return roles;
	}
	
	/**
	 * 获取角色名称
	 * @param 
	 * @return
	 */
	public List<Role> getName() {
		
		return roleDao.getName();
	}
	
	/**
	 * 验证角色名是否存在
	 * @param user
	 * @return
	 */
	public boolean checkName(Role role) {
		int count = 0;
		count = roleDao.checkName(role);
		if(count != 0){
			return false;
		}else{
			return true;
		}
		
	}
	
}
