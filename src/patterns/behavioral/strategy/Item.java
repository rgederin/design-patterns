package patterns.behavioral.strategy;

/**
 * Class which is represent single item in the online shop
 * 
 * @author rgederin
 * 
 */
public class Item {
	private String upcCode;
	private int price;

	public Item(String upc, int cost) {
		this.upcCode = upc;
		this.price = cost;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public int getPrice() {
		return price;
	}
}
