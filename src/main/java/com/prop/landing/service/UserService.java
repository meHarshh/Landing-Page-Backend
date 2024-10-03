package com.prop.landing.service;

import org.springframework.http.ResponseEntity;

import com.prop.landing.entity.User;
import com.prop.landing.util.ResponseStructure;

public interface UserService {

	ResponseEntity<ResponseStructure<User>> addUser(User user);

}
