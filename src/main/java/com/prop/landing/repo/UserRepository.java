package com.prop.landing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prop.landing.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
