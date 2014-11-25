package test.patterns.behavioral;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import patterns.behavioral.strategy.CreditCardStrategy;
import patterns.behavioral.strategy.Item;
import patterns.behavioral.strategy.PaypalStrategy;
import patterns.behavioral.strategy.ShoppingCart;

public class TestStrategy {
	private static final String CREDIT_CARD_OUTPUT = " paid with credit/debit card";
	private static final String PAYPAL_OUTPUT = " paid using Paypal";
	private static ShoppingCart shoppingCart;
	private static String result; 
	
	@Test
	public void testCreditCardStrategy(){
		shoppingCart = new ShoppingCart();
		shoppingCart.addItem(new Item("1", 80));
		result = shoppingCart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
		assertEquals(80 + CREDIT_CARD_OUTPUT, result);
	}
	
	@Test
	public void testPaypalStrategy(){
		shoppingCart = new ShoppingCart();
		shoppingCart.addItem(new Item("1", 80));
		result = shoppingCart.pay(new PaypalStrategy("mail@gmail.com", "452629"));
		assertEquals(80 + PAYPAL_OUTPUT, result);
	}
}
