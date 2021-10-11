package creational.factory_method;

import creational.factory_method.factory.SimplePizzaFactory;
import creational.factory_method.pizza.Pizza;

public class ImplementationExample {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory(); 
		Pizza pizza = factory.createPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = factory.createPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
