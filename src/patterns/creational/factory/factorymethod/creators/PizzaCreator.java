package patterns.creational.factory.factorymethod.creators;

import patterns.creational.factory.factorymethod.products.Pizza;



public abstract class PizzaCreator {

	public Pizza orderPizza(String type) {
		Pizza pizza = pizzaFactory(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza pizzaFactory(String type);
}
