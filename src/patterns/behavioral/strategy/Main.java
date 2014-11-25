package patterns.behavioral.strategy;

public class Main {
	public static void main(String [] args){
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);

		cart.addItem(item1);
		cart.addItem(item2);

		//pay by paypal
		String result = cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		System.out.println(result);

		//pay by credit card
		result = cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
		System.out.println(result);
	}
}
