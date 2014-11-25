package patterns.creational.factory.factorymethod.products;


public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza(){
		super.name = "New York Style Sauce and Cheese Pizza";
		super.base = "Thin Crust Base";
		super.sauce = "Marinara Sauce";
		super.additions.add("Grated Reggiano Cheese");
	}
}
