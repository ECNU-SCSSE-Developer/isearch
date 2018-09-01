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
    
    //����cs_dl��������Ԫ��
    List<CsDl> listAll();
}