package com.paymentApp.serviceImplemantation;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentApp.Entity.PaymentCards;
import com.paymentApp.Exception.CardAlreadyDeleted;
import com.paymentApp.Exception.CardAlreadyLinked;
import com.paymentApp.Exception.CardNumberNotMatch;
import com.paymentApp.Exception.CvvLengthNotMatch;
import com.paymentApp.dao.paymentsDao;
import com.paymentApp.services.PaymentService;

@Service
public class paymentServiceImp implements PaymentService {

	@Autowired
	private paymentsDao paymentsdao;

	@Override
	public List<PaymentCards> getpayments() {
		return paymentsdao.findAll();
	}

	int flag = 0;
	int fl = 0;

	@Override
	public PaymentCards addCard(PaymentCards cards) {

		String num = String.valueOf(cards.getCardNumber());
		String Cvv = String.valueOf(cards.getCvv());
		List<Long> getAllcard = paymentsdao.getAllDetail(cards.getCardNumber());
		getAllcard.forEach(e -> {
			if (e.equals(cards.getCardNumber())) {
				flag = 1;
				System.out.println("Card is linked already");
			}

		});
		if (Pattern.matches("[1-9][0-9]{15}$", num)) {
			if (Pattern.matches("[0-9]{3,4}$", Cvv)) {
				if (flag != 1) {
					paymentsdao.save(cards);
				} else {
					flag = 0;
					throw new CardAlreadyLinked("Card is already linked");

				}

			} else {
				flag = 0;
				throw new CvvLengthNotMatch("Cvv length should be 3 or 4 digit");
			}
		} else {
			flag = 0;
			throw new CardNumberNotMatch("card numberLength does not match");
		}
		return cards;
	}

	@Override
	public List<Long> getAllDetails() {
		// System.out.println(paymentsdao.getAllDetail());

		List<Long> getAllcard = paymentsdao.getAllDetail(null);

		getAllcard.forEach(e -> {
			String number = e.toString();
			if (number.equalsIgnoreCase("4111111111111111")) {
				System.out.println("This card is already linked");
			} else {
				System.out.println(number);
			}
		});
		return paymentsdao.getAllDetail(null);
	}

	@Override
	public PaymentCards deleteCourses(long cardNumber) {

		PaymentCards entity = null;
		List<PaymentCards> Alldetails = paymentsdao.findAll();

		Alldetails.forEach(e -> {
			// System.out.println(e.getCardNumber());
			// System.out.println(cardNumber);
			if (e.getCardNumber() == cardNumber) {
				System.out.println(e);
				fl = 1;
			}
		});

		if (fl != 1) {
			System.out.println(fl);
			fl = 0;
			throw new CardAlreadyDeleted("card is already not linked to this account");
		} else {
			fl = 0;
			System.out.println(fl);
			entity = paymentsdao.getOne(cardNumber);
			paymentsdao.delete(entity);
			// return ResponseEntity(Map.of("message","Card is deleted"),HttpStatus.OK);
		}
		return entity;
	}
}
