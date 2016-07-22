package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestOnePersonOneWallet.class,
	TestOnePersonTwoWallets.class,
	TestTwoPersonsOneWalletEach.class
})
public class TestCreditCardInterest {

}
