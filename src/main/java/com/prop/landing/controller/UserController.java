package com.prop.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prop.landing.entity.User;
import com.prop.landing.service.UserService;
import com.prop.landing.util.ResponseStructure;

@CrossOrigin(value = "http://sattvalumina.assetsglobal.in/" , allowCredentials = "true")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "users/addLeads")
	public ResponseEntity<ResponseStructure<User>> addUser(@RequestBody User user) {

		return userService.addUser(user);
	}
}
