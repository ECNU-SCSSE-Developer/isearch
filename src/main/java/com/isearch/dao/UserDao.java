package com.isearch.dao;

import com.isearch.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByEmail(String email);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}