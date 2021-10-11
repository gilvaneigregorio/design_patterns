package creational.factory_method.pizza;

public class CheesePizza extends Pizza {
	
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}

	@Override
	public void cut() {
		System.out.println("Cutting " + name+" in circles");
	}
}
