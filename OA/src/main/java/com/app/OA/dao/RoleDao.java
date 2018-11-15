package com.app.OA.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.app.OA.domain.Role;

@Component
public interface RoleDao {

	/**
	 * 增加权限
	 * @param Role 新增权限相关信息
	 * @return
	 */
	void add(@Param(value = "role") Role role);

	/**
	 * 删除权限
	 * @param name
	 * @return
	 */
	void delete(@Param(value = "id")Integer id);

	/**
	 * 修改权限
	 * @param Role 要修改的权限内容
	 * @return
	 */
	void update(@Param(value = "role") Role role);

	/**
	 * 查询权限
	 * @param 
	 * @return
	 */
	List<Role> selectAll();

	/**
	 * 获取权限名称
	 * @param parseInt
	 * @return
	 */
	String getRoleName(@Param(value = "id") int parseInt);

	/**
	 * 获取角色名称
	 * @param 
	 * @return
	 */
	List<Role> getName();

	/**
	 * 修改被删除角色的用户为普通权限
	 * @param 
	 * @return
	 */
	void updateUser(@Param(value = "id") Integer id);

	/**
	 * 验证角色名是否存在
	 * @param user
	 * @return
	 */
	int checkName(@Param(value = "role") Role role);

	
}
