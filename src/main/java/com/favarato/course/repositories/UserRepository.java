package com.favarato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favarato.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
