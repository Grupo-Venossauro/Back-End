package com.projectAsapcard.model;

import java.math.BigDecimal;

import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
	
	private Long id;
	
    private LocalDateTime transaction_date = LocalDateTime.now();
	
	private BigDecimal amount;
	
	private Person person;

	private List<Installment> installment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(LocalDateTime transaction_date) {
		this.transaction_date = transaction_date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

	public void setInstallment(List<Installment> installment) {
		this.installment = installment;
	}




	
	

}
