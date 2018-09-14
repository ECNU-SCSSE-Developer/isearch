package com.isearch.service;

import com.isearch.entity.User;

public interface UserService {
	User checkLogin(String email, String passwd);
}
