package patterns.creational.factory.simplefactory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case PizzaUtils.CHEESE:
			pizza = new CheesePizza();
			break;
		case PizzaUtils.VEGGIE:
			pizza = new VeggiePizza();
			break;
		}
		return pizza;
	}
}
