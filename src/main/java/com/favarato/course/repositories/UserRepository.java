package com.favarato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.favarato.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
