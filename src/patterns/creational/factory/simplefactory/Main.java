package patterns.creational.factory.simplefactory;

public class Main {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		
		pizzaStore.orderPizza(PizzaUtils.CHEESE);
	}
}
