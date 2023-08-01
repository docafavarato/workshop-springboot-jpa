package com.favarato.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favarato.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByNameIgnoreCaseContains(String name);
}
