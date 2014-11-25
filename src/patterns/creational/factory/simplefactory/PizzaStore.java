package patterns.creational.factory.simplefactory;

public class PizzaStore {
	private SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.bake();
		return pizza;
	}
}
