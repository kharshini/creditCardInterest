package com.creditCardInterest.model;

import com.creditCardInterest.interfaces.Card;

public class Discover implements Card {
	
	 private static final double RATE_OF_INTEREST = 0.01;
	 private double availableBalance;
	 
	 public Discover(double availableBalance){
		 this.availableBalance=availableBalance;
	 }

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return availableBalance*RATE_OF_INTEREST;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	   
}
