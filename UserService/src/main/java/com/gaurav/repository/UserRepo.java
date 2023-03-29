package com.gaurav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurav.model.User;


public interface UserRepo extends JpaRepository<User, Integer> {

}
