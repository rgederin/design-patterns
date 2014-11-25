package patterns.creational.factory.factorymethod.products;


public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		super.name = "Chicago Style Deep Dish Cheese Pizza";
		super.base = "Extra Thick Crust Dough";
		super.sauce = "Plum Tomato Sauce";
		super.additions.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
