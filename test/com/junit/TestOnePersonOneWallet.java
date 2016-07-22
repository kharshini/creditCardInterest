package com.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.creditCardInterest.model.CardType;
import com.creditCardInterest.model.Discover;
import com.creditCardInterest.model.MasterCard;
import com.creditCardInterest.model.Person;
import com.creditCardInterest.model.Visa;
import com.creditCardInterest.model.Wallet;
import com.creditCardInterest.interfaces.Card;
public class TestOnePersonOneWallet {
	
	Map<String,Card> cardList=new HashMap<String,Card>();
	List<Wallet> listOfWallets = new ArrayList<Wallet>();
	Person person;
	@Before
	public void setup(){
	cardList.put(CardType.DISCOVER.getValue(),new Discover(100));
	cardList.put(CardType.MASTER_CARD.getValue(),new MasterCard(100));
	cardList.put(CardType.VISA.getValue(),new Visa(100));
	Wallet wallet = new Wallet(cardList);
	listOfWallets.add(wallet);
	person = new Person(listOfWallets);
	}

	@Test
	public void testTotalInterestOfPerson() {
		assertEquals(16.0,person.getTotalInterestOfPerson(),0.01);
	}
	@Test
	public void testInterestOfDiscover(){
		assertEquals(1.0, cardList.get(CardType.DISCOVER.getValue()).getInterest(),0.01);
	}

	@Test
	public void testInterestOfMasterCard(){
		assertEquals(5.0, cardList.get(CardType.MASTER_CARD.getValue()).getInterest(),0.01);
	}

	@Test
	public void testInterestOfVisa(){
		assertEquals(10.0, cardList.get(CardType.VISA.getValue()).getInterest(),0.01);
	}

}
