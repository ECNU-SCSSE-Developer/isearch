package com.isearch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isearch.dao.UserDao;
import com.isearch.entity.User;
import com.isearch.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	/*
	 * 检查用户登录
	 */
	public User checkLogin(String email, String passwd) {
		User user = userDao.selectByEmail(email);
		if (user != null && user.getPasswd().equals(passwd)) {
			return user;
		}
		return null;
	}
	
}
