package com.forestcode.springboot_swagger_devops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.forestcode.springboot_swagger_devops.endpoint.mainEndPoint;
import com.forestcode.springboot_swagger_devops.model.userData;
import com.forestcode.springboot_swagger_devops.service.UserService;

@RestController
public class MainController implements mainEndPoint {

	@Autowired
	private UserService userService;

	@Override
	public userData saveUserData(userData ud) {
		System.out.println(ud.getUserEmail());
		return this.userService.saveUser(ud);
	}

	@Override
	public String testViewPage() {
		return "aaaaa";
	}

	@Override
	public List<userData> viewAllUserData() {
		return this.userService.getAllUser();
	}

}
