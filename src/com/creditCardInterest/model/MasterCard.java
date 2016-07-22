package com.creditCardInterest.model;

import com.creditCardInterest.interfaces.Card;

public class MasterCard implements Card{
	
	 private static final double RATE_OF_INTEREST = 0.05;
	 private double availableBalance;
	 
	 public MasterCard(double availableBalance){
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
