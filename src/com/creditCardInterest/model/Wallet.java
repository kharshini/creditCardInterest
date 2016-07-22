package com.creditCardInterest.model;
import java.util.Map;
import java.util.Map.Entry;

import com.creditCardInterest.interfaces.Card;

public class Wallet {

	private Map<String,Card> cards;

	public Map<String,Card> getCards() {
		return cards;
	}
	public Wallet(Map<String,Card> cards) {
		this.cards = cards;
	}
	
	public double getTotalInterestOfWallet() {
		double totalInterest=0;
		for (Entry<String, Card> card : cards.entrySet()){
			totalInterest+=card.getValue().getInterest();
		}
		return  totalInterest;
	}
}
