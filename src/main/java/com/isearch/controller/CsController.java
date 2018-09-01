package com.isearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isearch.entity.CsDl;
import com.isearch.service.CsDlService;

@Controller
@RequestMapping("/cs")
public class CsController {
	@Autowired
	private CsDlService csDlService;
	
	@RequestMapping(value = "/cs_dl", method = RequestMethod.GET)
	
	private ModelAndView getList(){
		ModelAndView mav = new ModelAndView();
		List<CsDl> list = csDlService.getList();
		// 放入转发参数
        mav.addObject("list", list);
        // 放入jsp路径
        mav.setViewName("cs_dl");
		return mav;
	}
	
}
