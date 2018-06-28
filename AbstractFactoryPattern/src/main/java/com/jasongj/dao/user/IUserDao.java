package com.jasongj.dao.user;

import com.jasongj.bean.User;

/**
 * 用户产品接口
 * 可实现功能 添加用户 删除用户 获取用户
 */
public interface IUserDao {
	
	void addUser(User user);
	void removeUser(User user);
	User getUser(String username);

}
