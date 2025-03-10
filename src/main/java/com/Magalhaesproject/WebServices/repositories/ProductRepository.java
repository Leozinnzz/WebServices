package com.Magalhaesproject.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Magalhaesproject.WebServices.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
