package com.isearch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isearch.dao.CsRecDao;
import com.isearch.entity.CsRec;
import com.isearch.service.CsRecService;

@Service
public class CsRecServiceImpl implements CsRecService{
	@Autowired
	private CsRecDao csRecDao;

	/*得到cs_dl表中所有元组*/
	public List<CsRec> getAll() {
		List<CsRec> list = csRecDao.getAll();
		return list;
	}
	
	
}
