package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.UserInfo;
import com.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserInfo> getUserDetail() {
		
		//List<UserInfo> userList = new ArrayList<UserInfo>();
		return userRepository.findAll();
		
	}
}
