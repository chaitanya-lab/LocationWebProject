package com.paymentApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.paymentApp.Entity.PaymentCards;

public interface paymentsDao extends JpaRepository<PaymentCards, Long>{
	

	@Query("Select p.cardNumber from PaymentCards p where p.cardNumber=:c")
	public List<Long> getAllDetail(@Param("c")Long cardNumber);

}