package com.isearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isearch.dao.CsDlDao;
import com.isearch.entity.CsDl;
import com.isearch.service.CsDlService;

@Service
public class CsDlServiceImpl implements CsDlService {

	@Autowired
	CsDlDao csDlDao;
	
	public List<CsDl> getList() {
		List<CsDl> csDls = csDlDao.listAll();
		return csDls;
	}

}
