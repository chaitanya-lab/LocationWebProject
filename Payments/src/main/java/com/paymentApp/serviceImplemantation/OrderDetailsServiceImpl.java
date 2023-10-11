package com.paymentApp.serviceImplemantation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.paymentApp.Entity.Order;
import com.paymentApp.dao.OrderDetailsDao;
import com.paymentApp.services.OrderdetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderdetailsService {

	@Autowired
	private OrderDetailsDao orderDetailsDao;


	@Override
	public Order getOrderDetails(String uuid) {
	    Order order=orderDetailsDao.getAllDetail(uuid);
	    return order;
	
	}
}
