package com.isearch.dao;

import java.util.List;

import com.isearch.entity.CsDl;

public interface CsDlDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CsDl record);

    int insertSelective(CsDl record);

    CsDl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CsDl record);

    int updateByPrimaryKey(CsDl record);
    
    //返回cs_dl中所有元组
    List<CsDl> getAll();
}