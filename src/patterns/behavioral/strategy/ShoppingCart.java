package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which is represent Shopping Cart with the list of chosen items
 * 
 * @author rgederin
 * 
 */
public class ShoppingCart {

	// List of items
	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public String pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		return paymentMethod.pay(amount);
	}

	
}
