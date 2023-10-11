package com.paymentApp.Controller;

import org.hibernate.InvalidMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.paymentApp.Entity.Order;
import com.paymentApp.dao.OrderDetailsDao;
import com.paymentApp.services.OrderdetailsService;

@RestController
public class OrdersController {

	@Autowired
   private OrderdetailsService orderDetailsService;  
	
	@GetMapping("/Cartid/{uuid}")
	public Order getCartDetails(@PathVariable String uuid) throws InvalidMappingException  {
		return this.orderDetailsService.getOrderDetails(uuid);
		
	}

	
}
