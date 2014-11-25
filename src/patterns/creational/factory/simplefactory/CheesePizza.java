package patterns.creational.factory.simplefactory;

public class CheesePizza extends Pizza{
	public CheesePizza(){
		System.out.println("Creating " + PizzaUtils.CHEESE +" pizza...");
	}
}
