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
	
	
	/*得到cs_dl表中所以元组*/
	public List<CsDl> getList() {
		List<CsDl> csDls = csDlDao.getAll();
		return csDls;
	}

	public int insert(CsDl record) {
		csDlDao.insert(record);
		return 1;
	}
}
