package patterns.creational.factory.simplefactory;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		System.out.println("Creating " + PizzaUtils.VEGGIE + " pizza...");
	}
}
