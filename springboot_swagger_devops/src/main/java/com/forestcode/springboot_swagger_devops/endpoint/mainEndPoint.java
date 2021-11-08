package com.forestcode.springboot_swagger_devops.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.forestcode.springboot_swagger_devops.model.userData;

public interface mainEndPoint {
    
	@GetMapping("/testview")
	public String testViewPage();
	
	

	@PostMapping("/create")
    public userData saveUserData(userData ud);

	@GetMapping("/viewall")
    public List<userData> viewAllUserData();

    
}
