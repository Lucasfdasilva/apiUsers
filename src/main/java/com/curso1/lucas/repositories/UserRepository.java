package com.curso1.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso1.lucas.entitys.User;

public interface UserRepository extends JpaRepository <User, Long> {
	

}
