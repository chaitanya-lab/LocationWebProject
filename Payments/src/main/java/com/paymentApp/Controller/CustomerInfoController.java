package com.paymentApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentApp.Entity.Customers;
import com.paymentApp.dao.CustomerDao;

@RestController
public class CustomerInfoController {

	
	@Autowired
	private CustomerDao customerdao;
	
	
	@GetMapping("/Customers")
	public List<Customers> getAllCustomer() {
		 return this.customerdao.findAll();
	}

}
