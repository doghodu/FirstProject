package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.domain.ManagerDTO;
import com.board.service.ManagerService;

@Controller
@RequestMapping(value="/manager/*")
public class ManagerController {
	
	
	@Inject
	 private ManagerService service;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/manager/managerhome";
	}
	
	
	@RequestMapping(value = "/loginView", method = RequestMethod.GET)
	public String loginView(Locale locale, Model model) throws Exception {
		return "/manager/login";
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public  String login(Locale locale, Model model, ManagerDTO dto, HttpSession session) throws Exception { 
		
		ManagerDTO dto2 = service.login(dto);
		
		if(dto != null) {
			session.setAttribute("id", dto2.getId());
			return "Y";
		}else {
			return "N";
		}
	}
	
	@RequestMapping(value = "/registerView", method = RequestMethod.GET)
	public String registerView(Locale locale, Model model) throws Exception {
		return "/manager/register";
	}
	
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public  String register(Locale locale, Model model, ManagerDTO dto) throws Exception {
	
		if(service.register(dto) == 1) {
			return "Y";
		}else {
			return "N";
		}
	}
}
