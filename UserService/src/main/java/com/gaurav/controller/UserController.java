package com.gaurav.controller;

import java.util.List;

import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.User;
import com.gaurav.service.UserService;

@RestController
//@LoadBalancerClient(name="myLoadBalancer", configuration=)
public class UserController  {
	@Autowired
	private UserService service;
	@PostMapping("/user")
	public User user(User s) {
		// TODO Auto-generated method stub
		return service.user(s);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return service.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public User getUset(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getUset(id);
	}

}
