package patterns.creational.factory.factorymethod.products;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String name;
	protected String base;
	protected String sauce;
	protected List<String> additions = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough ... ");
		System.out.println("Adding sauce ... ");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < additions.size(); i++)
			System.out.println(" " + additions.get(i));
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza on official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public String getBase() {
		return base;
	}

	public String getSauce() {
		return sauce;
	}

	public List<String> getAdditions() {
		return additions;
	}
}
