package com.board.controller;

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

import com.board.domain.MemberDTO;
import com.board.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Inject
	 private MemberService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {	
		return "/member/login";
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public  String regi(Locale locale, Model model, MemberDTO dto, HttpSession session) throws Exception { 
		
		MemberDTO dto2 = service.login(dto);
		
		if(dto != null) {
			session.setAttribute("id", dto2.getId());
			return "Y";
		}else {
			return "N";
		}
	}
	
	@RequestMapping(value = "/member/register", method = RequestMethod.GET)
	public void getRegister() throws Exception{
		logger.info("get register");
	}
	
	@RequestMapping(value = "/member/register", method = RequestMethod.POST)
	public String postRegister(MemberDTO dto) throws Exception{
		logger.info("post register");
		
		service.register(dto);
		return null;
	}
}