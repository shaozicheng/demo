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
import com.app.OA.domain.Power;
import com.app.OA.domain.User;
import com.app.OA.service.AccountService;
import com.app.OA.service.PowerService;
import com.app.OA.AES.anno.Decrypt;
import com.app.OA.AES.anno.Encrypt;

/***
 * 权限管理
 * @author 邵子城 2018/7/30
 *
 */

@RestController
@CrossOrigin
@RequestMapping("/power")
public class PowerController {

	final static Logger logger = LoggerFactory.getLogger(PowerController.class);
	
	@Autowired
	PowerService powerService;
	
	@Autowired
	AccountService accountService;
	
	/**
	 * 增加权限
	 * @param power 新增权限相关信息
	 * @return
	 */
	@RequestMapping("/add")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity add(@RequestBody Power power) {
		Entity entity= new Entity();
		try {
			powerService.add(power);
			entity.setSuccess(true);
			entity.setMessage("创建成功");
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("创建失败");
		}
		
		return entity;
	}
	
	/**
	 * 删除权限
	 * @param name 账户	
	 * @param passward	 密码
	 * @return
	 */
	@RequestMapping("/delete")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity delete(@RequestBody User user ){
		Entity entity= new Entity();
		try {
			if(user.getId() == 1 || user.getId() == 2){
				entity.setMessage("基础权限无法删除");
				entity.setSuccess(false);
				return entity;
			}
			boolean check= accountService.checkPower(user.getName());
			if(check){
				powerService.delete(user);
				entity.setMessage("删除成功");
				entity.setSuccess(true);
			}else{
				entity.setMessage("账户权限不足");
				entity.setSuccess(false);
			}
		} catch (Exception e) {
			entity.setMessage("删除失败");
			e.printStackTrace();
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 修改权限
	 * @param power 要修改的权限内容
	 * @return
	 */
	@RequestMapping("/update")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity update(@RequestBody Power power){
		Entity entity= new Entity();
		try {
			boolean check= accountService.checkPower(power.getUpdateUser());
			if(check && power.getId() != 1){
				powerService.update(power);
				entity.setMessage("修改成功");
				entity.setSuccess(true);
			}else{
				entity.setMessage("账户权限不足");
				entity.setSuccess(false);
			}
		} catch (Exception e) {
			entity.setMessage("修改失败");
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 查询权限
	 * @param 
	 * @return
	 */
	@RequestMapping("/select")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity select(@RequestBody Power power) {
		Entity entity= new Entity();
		try {
			List<Power> powers = powerService.selectAll(power);
			entity.setResult(powers);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("查询失败");
		}

		return entity;
	}
}
