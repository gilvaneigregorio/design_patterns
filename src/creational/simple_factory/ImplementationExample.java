package creational.simple_factory;

import creational.simple_factory.factory.SimplePizzaFactory;
import creational.simple_factory.pizza.Pizza;

public class ImplementationExample {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory(); 
		Pizza pizza = factory.createPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = factory.createPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
