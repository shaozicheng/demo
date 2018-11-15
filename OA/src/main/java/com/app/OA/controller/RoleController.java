package com.app.OA.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.OA.domain.Entity;
import com.app.OA.domain.Role;
import com.app.OA.domain.User;
import com.app.OA.service.AccountService;
import com.app.OA.service.RoleService;
import com.app.OA.AES.anno.Decrypt;
import com.app.OA.AES.anno.Encrypt;

/***
 * 角色管理
 * @author 邵子城 2018/7/30
 *
 */

@RestController
@CrossOrigin
@RequestMapping("/role")
public class RoleController {

	final static Logger logger = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	AccountService accountService;
	
	/**
	 * 增加角色
	 * @param Role 新增角色相关信息
	 * @return
	 */
	@RequestMapping("/add")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity add(@RequestBody Role role) {
		Entity entity= new Entity();
		try {
			roleService.add(role);
			entity.setSuccess(true);
			entity.setMessage("创建成功");
		} catch (Exception e) {
			entity.setMessage("发生未知错误");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 删除角色
	 * @param name 账户	
	 * @param passward	 密码
	 * @return
	 */
	@RequestMapping("/delete")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity delete(@RequestBody User user){
		Entity entity= new Entity();
		try {
			if(user.getId() == 1 || user.getId() == 2){
				entity.setMessage("无法删除");
				entity.setSuccess(false);
				return entity;
			}
			boolean check = accountService.checkPower(user.getUserName());
			boolean check2= accountService.checkRole(user.getUserName());
			boolean userPower = accountService.checkPower(user.getId());
			boolean userPower2 = accountService.checkRole(user.getId());
			if((check && !userPower ) ||(check2 && !userPower && !userPower2) ){
				roleService.delete(user);
				entity.setMessage("删除成功");
				entity.setSuccess(true);
			}else{
				entity.setMessage("删除失败");
				entity.setSuccess(false);
			}
		} catch (Exception e) {
			entity.setMessage("发生未知错误");
			e.printStackTrace();
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 修改角色
	 * @param Role 要修改的角色内容
	 * @return
	 */
	@RequestMapping("/update")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity update(@RequestBody Role role){
		Entity entity= new Entity();
		try {
			boolean check = accountService.checkPower(role.getUpdateUser());
			boolean check2= accountService.checkRole(role.getUpdateUser());
			boolean userPower = accountService.checkPower(role.getId());
			boolean userPower2 = accountService.checkRole(role.getId());
			if((check && !userPower ) ||(check2 && !userPower && !userPower2)){
				roleService.update(role);
				entity.setMessage("修改成功");
				entity.setSuccess(true);
			}else{
				entity.setMessage("修改失败,无权限修改该角色");
				entity.setSuccess(false);
			}

		} catch (Exception e) {
			entity.setMessage("修改失败");
			entity.setSuccess(false);
			e.printStackTrace();
		}
		
		return entity;
	}
	
	/**
	 * 查询角色
	 * @param 
	 * @return
	 */
	@RequestMapping("/select")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity select() {
		Entity entity= new Entity();
		try {
			List<Role> roles = roleService.selectAll();
			entity.setResult(roles);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("获取失败");
		}
		
		return entity;
	}
	
	/**
	 * 获取角色名称
	 * @param 
	 * @return
	 */
	@RequestMapping("/getname")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getName() {
		Entity entity= new Entity();
		try {
			List<Role> roles = roleService.getName();
			entity.setResult(roles);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("获取失败");
		}
		
		return entity;
	}
	
	/**
	 * 验证角色名是否存在
	 * @param user
	 * @return
	 */
	@RequestMapping("/checkname")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkName(@RequestBody Role role ){
		Entity entity = new Entity();
		try {
			boolean check = roleService.checkName(role);
			
			if(check){
				entity.setSuccess(true);
			}else{
				entity.setMessage("该角色已存在");
				entity.setSuccess(false);
			}
			
		} catch (Exception e) {
			entity.setSuccess(false);
			e.printStackTrace();
		}
		
		return entity;
	}
	
}
