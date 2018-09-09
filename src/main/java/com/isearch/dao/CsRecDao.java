package com.isearch.dao;

import java.util.List;

import com.isearch.entity.CsDl;
import com.isearch.entity.CsRec;

public interface CsRecDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CsRec record);

    int insertSelective(CsRec record);

    CsRec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CsRec record);

    int updateByPrimaryKey(CsRec record);
    
    List<CsRec> getAll();
}