package com.projectAsapcard.model;

import com.opencsv.bean.CsvBindByPosition;

public class CsvData {

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String timestamp;

    @CsvBindByPosition(position = 2)
    private String PersonId;

    @CsvBindByPosition(position = 3)
    private String name;

    @CsvBindByPosition(position = 4)
    private int age;

    @CsvBindByPosition(position = 5)
    private double amount;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPersonId() {
		return PersonId;
	}

	public void setPersonId(String personId) {
		PersonId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getInstallment_number() {
		return installment_number;
	}

	public void setInstallment_number(int installment_number) {
		this.installment_number = installment_number;
	}

	@CsvBindByPosition(position = 6)
    private int installment_number;
    
    public CsvData() {
      
    }

}	

