package com.paymentApp.Controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.hibernate.InvalidMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentApp.Entity.PaymentCards;
import com.paymentApp.services.PaymentService;

@RestController
public class paymentController {

	@Autowired
	private PaymentService paymentservice;

	@GetMapping("/home")
	public String Home() {
		return "This is my Course Application";
	}

	@GetMapping("/payments")

	public List<PaymentCards> getPayments() {
		return this.paymentservice.getpayments();
	}

	@PostMapping("/payments")

	public PaymentCards AddCard(@RequestBody PaymentCards cards) {

		return this.paymentservice.addCard(cards);

	}

	@GetMapping("/paymentOne")

	public List<Long> getAllDetails() {
		return this.paymentservice.getAllDetails();
	}

	@DeleteMapping("/remove-payment/{cardNumber}")
	public ResponseEntity deleteCourses(@PathVariable String cardNumber) throws InvalidMappingException {
		this.paymentservice.deleteCourses(Long.parseLong(cardNumber));
		return new ResponseEntity<Map<String, String>>(Map.of("status", "200", "error", "", "message", "card is deleted successfully"),
				HttpStatus.OK);

	}
	@GetMapping("/GetCartID")
	public ResponseEntity<Map<String, UUID>> GenerateCard() {
		UUID uuid=UUID.randomUUID();  
		return new ResponseEntity<Map<String, UUID>>(Map.of("CartID", uuid),
				HttpStatus.OK);
	}
}
