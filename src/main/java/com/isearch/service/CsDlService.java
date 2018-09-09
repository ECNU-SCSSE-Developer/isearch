package com.isearch.service;

import java.util.List;

import com.isearch.entity.CsDl;

public interface CsDlService {
	List<CsDl> getList();//返回cs_dl中所有元组
	int insert(CsDl record);
}
