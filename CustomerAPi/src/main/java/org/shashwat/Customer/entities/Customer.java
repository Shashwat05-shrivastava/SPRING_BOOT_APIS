package org.shashwat.Customer.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Entity
public class Customer extends Audittable<String>{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String  customerName;
	private String customerAddress;
	private LocalDate dateOfBirth;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String customerName, String customerAddress, LocalDate dateOfBirth) {
		super();
		this.cid = cid;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.dateOfBirth = dateOfBirth;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
