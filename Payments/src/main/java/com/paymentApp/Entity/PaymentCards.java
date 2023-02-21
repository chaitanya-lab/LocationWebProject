package com.paymentApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class PaymentCards {

	@Id
	@Column(unique = true)
	private long cardNumber;

	
	private int rank;
	private String cardName;
	private int cvv;

	private int year;
	private int month;

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public PaymentCards(long cardNumber, int rank, String cardName, int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.rank = rank;
		this.cardName = cardName;
		this.cvv = cvv;
	}

	public PaymentCards() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PaymentCards [cardNumber=" + cardNumber + ", rank=" + rank + ", cardName=" + cardName + ", Cvv=" + cvv
				+ "]";
	}

}
