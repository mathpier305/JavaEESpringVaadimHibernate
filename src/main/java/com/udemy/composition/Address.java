package com.udemy.composition;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TABLE")
public class Address {

	@Id
	@GeneratedValue
	private int addressId;
	
	@Column(name="address_name")
	private String addressName;
	
	@Column(name="zip_code")
	private int zipCode;
	
	public Address() {
	}
	
	public Address(String addressName, int zipCode) {
		this.addressName = addressName;
		this.zipCode = zipCode;
	}

	@OneToOne
	@JoinColumn(name="employeeId")
	private Employee employee;

	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
