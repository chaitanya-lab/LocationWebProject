package com.paymentApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentApp.Entity.Customers;

public interface CustomerDao extends JpaRepository<Customers, String> {

}
