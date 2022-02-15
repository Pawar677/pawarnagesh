package com.sonata.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sonata.demo.entities.UserInfo;
import com.sonata.demo.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String User() {
		
		return "Hi User Services";
	}
	
// Create a method to get user Information
	
	@GetMapping("/data")
	public List<UserInfo> getData() 
	{
		return this.userService.getData();
	}
}
