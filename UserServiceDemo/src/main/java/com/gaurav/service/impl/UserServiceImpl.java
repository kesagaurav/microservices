package com.gaurav.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.User;
import com.gaurav.repository.UserRepo;
import com.gaurav.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepository;

	@Override
	public com.gaurav.model.User user(com.gaurav.model.User s) {
		// TODO Auto-generated method stub
		return userRepository.save(s);
	}

	@Override
	public List<com.gaurav.model.User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUset(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	

}
