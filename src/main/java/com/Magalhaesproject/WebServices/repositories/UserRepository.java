package com.Magalhaesproject.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Magalhaesproject.WebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
