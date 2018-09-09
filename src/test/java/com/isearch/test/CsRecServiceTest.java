package com.isearch.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.isearch.entity.CsRec;
import com.isearch.service.CsRecService;

public class CsRecServiceTest extends BaseTest{
	private static Logger logger = Logger.getLogger(CsRecServiceTest.class);
	
	@Autowired
	CsRecService csRecService;
	
	@Test
	public void testGetAll() throws Exception{
		List<CsRec> csRecs = csRecService.getAll();
		for (CsRec csRec : csRecs) {
			logger.info(csRec.toString());
		}
	}
}
