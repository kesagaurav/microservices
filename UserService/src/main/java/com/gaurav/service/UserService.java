package com.gaurav.service;

import java.util.List;
import java.util.Optional;

import com.gaurav.model.User;

public interface UserService {
public User user(User s);
public List<User> getAllUsers();
public User getUset(int id);

}

