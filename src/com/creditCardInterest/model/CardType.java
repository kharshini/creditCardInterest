package com.creditCardInterest.model;

public enum CardType {
	
	DISCOVER("DISCOVER"),
	MASTER_CARD("MASTER CARD"),
	VISA("VISA");
	private String value;
	
	CardType(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	

}
