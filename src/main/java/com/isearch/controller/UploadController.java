package com.isearch.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isearch.entity.UploadedImageFile;
import com.isearch.service.UploadService;

@Controller
public class UploadController {
	private static Logger logger = Logger.getLogger(UploadController.class);

	@Autowired
	private UploadService UploadService;

	@RequestMapping("/uploadImage")
	public ModelAndView upload(HttpServletRequest request, UploadedImageFile file)
			throws IllegalStateException, IOException {

		boolean res = UploadService.uploadFile(file);
		ModelAndView mav = new ModelAndView();

		if (res == true) {
			mav.setViewName("uploadSuccess");
		} else {
			mav.setViewName("uploadFail");
		}
		return mav;
	}
}