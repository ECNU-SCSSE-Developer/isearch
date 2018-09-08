package com.isearch.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.isearch.entity.CsDl;
import com.isearch.service.CsDlService;

public class CsDlServiceTest extends BaseTest {
	private static Logger logger = Logger.getLogger(CsDlServiceTest.class);
	@Autowired
	CsDlService csDlService;

	@Test
	public void testQueryAll() throws Exception {
		List<CsDl> csDls = csDlService.getList();
		for (CsDl csDl : csDls) {
			logger.info(csDl.toString());
		}
	}

	/*
	@Test
	public void testAdd() throws Exception {
		for (int i = 0; i < 100; i++) {
			CsDl csDl = new CsDl();
			csDl.setName("Test");
			csDl.setIntro("tessssssssssssssssssssssssssssssssssssssssssssssssssstttt");
			csDlService.insert(csDl);
		}
	}
	*/

}
