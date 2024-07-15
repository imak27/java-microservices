package com.angad.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angad.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
