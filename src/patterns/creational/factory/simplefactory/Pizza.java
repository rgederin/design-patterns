package patterns.creational.factory.simplefactory;

public abstract class Pizza {
	public void prepare(){
		System.out.println("Prepare pizza...");
	}
	
	public void bake(){
		System.out.println("Bake pizza...");
	}
	
	public void cut(){
		System.out.println("Cut pizza...");
	}
	
	public void box(){
		System.out.println("Box pizza...");
	}
}
