package com.Magalhaesproject.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Magalhaesproject.WebServices.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
