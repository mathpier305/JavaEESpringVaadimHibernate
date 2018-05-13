package com.udemy.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Bus extends Vehicle {

	private int numberOfPassenger;

	public Bus() {

	}

	public Bus(String name, int numberOfPassenger) {
		super(name);
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

}
