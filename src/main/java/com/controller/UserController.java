package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService m_userService;
	
	@RequestMapping(value="/user", method = RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Object getUser() {
		
		return m_userService.getUserDetail();
	}
		
		
}
