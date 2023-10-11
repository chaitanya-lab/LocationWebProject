package com.paymentApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.paymentApp.Entity.Order;

public interface OrderDetailsDao extends JpaRepository<Order, String>{

	@Query("Select p from Order p where p.uuid=:c")
	public Order getAllDetail(@Param("c")String uuid);


}
