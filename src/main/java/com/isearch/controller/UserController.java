package com.isearch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.isearch.entity.User;
import com.isearch.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes(types = { User.class }, value = { "user" })
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping("/checkLogin")
	public String checkLogin(HttpServletRequest request,User user, Model model) {
		user = userService.checkLogin(user.getEmail(), user.getPasswd());
		logger.info("contextPath: " + request.getContextPath());
		logger.info("servletPath: " + request.getServletPath());
		if (user != null) {
			model.addAttribute("user", user);
			//return "redirect:/cs/cs_dl";
			return "loginSuccess";
		}
		return "loginFail";
	}
	
	
	/*需要清除session中的数据时，需同时在HttpSession与@SessionAttributes注解中清除session数据*/
	@RequestMapping("/logout")
    public String outLogin(HttpSession session,SessionStatus sessionStatus){
		logger.info("before:" + session.getAttribute("user"));
		session.removeAttribute("user");//清除HttpSession中的数据
		logger.info("after:" + session.getAttribute("user"));
		sessionStatus.setComplete();//清除通过@SessionAttributes注解方式添加的数据
		return "redirect:/cs/cs_dl";
    }
}
