package com.forestcode.springboot_swagger_devops.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forestcode.springboot_swagger_devops.model.userData;

public interface UserDataRepo extends JpaRepository<userData, Integer>{

}
