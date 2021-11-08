package com.forestcode.springboot_swagger_devops.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.forestcode.springboot_swagger_devops.model.userData;

@Service
public interface UserService {

	
	public userData saveUser(userData ud);
	
	public List<userData> getAllUser();
	
	
	
	
}
