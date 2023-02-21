package com.paymentApp.services;

import java.util.List;

import com.paymentApp.Entity.PaymentCards;

public interface PaymentService {

	public List<PaymentCards> getpayments();

	public PaymentCards addCard(PaymentCards cards);

	public List<Long> getAllDetails();

	public PaymentCards deleteCourses(long parseLong);

}
