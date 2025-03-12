package com.Magalhaesproject.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Magalhaesproject.WebServices.entities.OrderItem;
import com.Magalhaesproject.WebServices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
