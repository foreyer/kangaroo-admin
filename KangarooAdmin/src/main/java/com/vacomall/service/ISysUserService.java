package com.vacomall.service;

import java.util.Map;

import com.baomidou.framework.service.ISuperService;
import com.baomidou.mybatisplus.plugins.Page;
import com.vacomall.entity.SysUser;

/**
 *
 * SysUser 表数据服务层接口
 *
 */
public interface ISysUserService extends ISuperService<SysUser> {
	
	/**
	 * 分页查询用户
	 */
	Page<Map<Object, Object>> selectUserPage(Page<Map<Object, Object>> page, String search);
	
	/**
	 * 保存用户
	 */
	void insertUser(SysUser user, String[] roleId);
	/**
	 * 更新用户
	 */
	void updateUser(SysUser sysUser, String[] roleId);
	/**
	 * 登录
	 */
	SysUser login(String userName, String password);

}