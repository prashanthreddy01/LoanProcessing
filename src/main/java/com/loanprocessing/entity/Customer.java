package com.loanprocessing.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "LOAN_SPRING_CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	@NotBlank(message = "Name is required")
	private String custName;
	@NotBlank(message = "PhoneNumber is required")
	private String phoneNumber;
	private float salary;
	private String adhaar;
	private LocalDate dateOfApplication;
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String phoneNumber, float salary, String adhaar, LocalDate dateOfApplication) {
		
		this.custId = custId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.adhaar = adhaar;
		this.dateOfApplication=dateOfApplication;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}

	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	
}
