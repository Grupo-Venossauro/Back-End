package com.projectAsapcard.model;

import java.math.BigDecimal;




public class Installment {
	

	private Long id;
	
	private Integer installment_number;
	
	private BigDecimal value;

	private Transaction transaction;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getInstallment_number() {
		return installment_number;
	}

	public void setInstallment_number(Integer installment_number) {
		this.installment_number = installment_number;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	

	

}
