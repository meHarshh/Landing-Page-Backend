package com.prop.landing.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prop.landing.entity.User;
import com.prop.landing.repo.UserRepository;
import com.prop.landing.service.UserService;
import com.prop.landing.util.ResponseStructure;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ResponseStructure<User> responseStructure;

	@Override
	public ResponseEntity<ResponseStructure<User>> addUser(User user) {

		String message = String.format(
				"Thank you for expressing your interest, %s! Our team will reach out to you shortly.",
				user.getUserName());

		return ResponseEntity.ok(responseStructure.setMessage(message).setData(userRepository.save(user))
				.setStatus(HttpStatus.OK.value()));
	}

}
