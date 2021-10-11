package creational.factory_method.pizza;

public class ClamPizza extends Pizza {
	
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting " + name+" in squares");
	}
}
