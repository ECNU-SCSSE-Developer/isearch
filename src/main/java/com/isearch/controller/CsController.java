package com.isearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.isearch.entity.CsDl;
import com.isearch.entity.Page;
import com.isearch.service.CsDlService;

@Controller
@RequestMapping("/cs")
public class CsController {
	@Autowired
	private CsDlService csDlService;

	@RequestMapping(value = "/cs_dl", method = RequestMethod.GET)
	private ModelAndView getList(Page page) {
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(), 5);
		List<CsDl> list = csDlService.getList();
		int total = (int) new PageInfo<CsDl>(list).getTotal();
		page.caculateLast(total);

		mav.addObject("list", list);
		mav.setViewName("cs_dl");
		return mav;
	}

}
