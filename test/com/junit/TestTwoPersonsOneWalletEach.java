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

public class TestTwoPersonsOneWalletEach {

	Map<String,Card> cardList=new HashMap<String,Card>();
	Map<String,Card> cardList1=new HashMap<String,Card>();
	Wallet wallet;
	Wallet wallet1;
	List<Wallet> listOfWallets = new ArrayList<Wallet>();
	List<Wallet> listOfWallets1 = new ArrayList<Wallet>();
	Person person1;
	Person person2;
	@Before
	public void setup(){
	cardList.put(CardType.VISA.getValue(),new Visa(100));
	cardList.put(CardType.DISCOVER.getValue(),new Discover(100));
	cardList.put(CardType.MASTER_CARD.getValue(),new MasterCard(100));
	cardList1.put(CardType.VISA.getValue(),new Visa(100));
	cardList1.put(CardType.MASTER_CARD.getValue(),new MasterCard(100));
	 wallet = new Wallet(cardList);
	 wallet1 = new Wallet(cardList1);
	listOfWallets.add(wallet);
	listOfWallets1.add(wallet1);
	person1 = new Person(listOfWallets);
	person2 = new Person(listOfWallets1);
	}

	@Test
	public void testTotalInterestOfPerson1() {

		assertEquals(16.0,person1.getTotalInterestOfPerson(),0.01);
	}
	
	@Test
	public void testTotalInterestOfPerson2() {

		assertEquals(15.0,person2.getTotalInterestOfPerson(),0.01);
	}
	@Test
	public void testInterestforWallet(){
		assertEquals(16.0,wallet.getTotalInterestOfWallet(),0.01);
	}

	@Test
	public void testInterestforWallet1(){
		assertEquals(15.0, wallet1.getTotalInterestOfWallet(),0.01);
	}

}
