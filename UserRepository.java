package com.springrest.springrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public List<UserEntity> findByEmail(String email);
	System.out.println("regex_expression");
}
