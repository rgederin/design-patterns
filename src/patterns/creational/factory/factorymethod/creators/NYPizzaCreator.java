package patterns.creational.factory.factorymethod.creators;

import patterns.creational.factory.factorymethod.products.NYStyleCheesePizza;
import patterns.creational.factory.factorymethod.products.Pizza;
import patterns.creational.factory.simplefactory.PizzaUtils;

public class NYPizzaCreator extends PizzaCreator {

	@Override
	protected Pizza pizzaFactory(String type) {
		switch (type) {
		case PizzaUtils.CHEESE:
			return new NYStyleCheesePizza();

			// Here we could add another variants of New York style pizza
		default:
			return null;
		}
	}

}
