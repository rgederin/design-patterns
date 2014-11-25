package patterns.creational.factory.factorymethod.main;

import patterns.creational.factory.factorymethod.creators.ChicagoPizzaCreator;
import patterns.creational.factory.factorymethod.creators.NYPizzaCreator;
import patterns.creational.factory.factorymethod.creators.PizzaCreator;
import patterns.creational.factory.factorymethod.products.Pizza;
import patterns.creational.factory.simplefactory.PizzaUtils;

public class Main {

	public static void main(String[] args) {
		PizzaCreator newYorkPizzaCreator = new NYPizzaCreator();
		PizzaCreator chicagoPizzaCreator = new ChicagoPizzaCreator();
		
		Pizza pizza = newYorkPizzaCreator.orderPizza(PizzaUtils.CHEESE);
		System.out.println();
		pizza = chicagoPizzaCreator.orderPizza(PizzaUtils.CHEESE);
	
	}
}
