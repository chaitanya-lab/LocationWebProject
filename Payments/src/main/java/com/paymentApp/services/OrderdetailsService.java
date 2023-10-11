package com.paymentApp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.paymentApp.Entity.Order;

@Service
public interface OrderdetailsService {



	

	public Order getOrderDetails(String uuid);

}
