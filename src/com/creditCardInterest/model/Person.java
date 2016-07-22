package com.creditCardInterest.model;

import java.util.List;


public class Person {

	private List<Wallet> wallets;
	public List<Wallet> getWallets() {
		return wallets;
	}
	public Person(List<Wallet> wallet){
		this.wallets = wallet;
	}
	
	public double getTotalInterestOfPerson() {
		double totalInterest=0;
		for (Wallet wallet : wallets){
			totalInterest+=wallet.getTotalInterestOfWallet();
		}
		return  totalInterest;

	}
}