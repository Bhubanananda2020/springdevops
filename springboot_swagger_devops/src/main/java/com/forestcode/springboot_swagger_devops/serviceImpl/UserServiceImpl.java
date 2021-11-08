package com.forestcode.springboot_swagger_devops.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forestcode.springboot_swagger_devops.model.userData;
import com.forestcode.springboot_swagger_devops.repo.UserDataRepo;
import com.forestcode.springboot_swagger_devops.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDataRepo userDataRepo;
	
	@Override
	public userData saveUser(userData ud) {
		return this.userDataRepo.save(ud);
	}

	@Override
	public List<userData> getAllUser() {	
		
		List<userData> findAll = this.userDataRepo.findAll();
		System.out.println(findAll);
		for (userData userData : findAll) {
			System.out.println(userData);
		}
		return this.userDataRepo.findAll();
	}

}
