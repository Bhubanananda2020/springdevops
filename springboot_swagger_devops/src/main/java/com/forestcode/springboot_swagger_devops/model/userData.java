package com.forestcode.springboot_swagger_devops.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class userData{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String userLname;
    private String userEmail;
    private String userPassword;
}