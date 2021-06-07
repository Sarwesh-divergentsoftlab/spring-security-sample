package com.divergentsl.spring_secuity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divergentsl.spring_secuity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
