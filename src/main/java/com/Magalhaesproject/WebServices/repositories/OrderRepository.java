package com.Magalhaesproject.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Magalhaesproject.WebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
