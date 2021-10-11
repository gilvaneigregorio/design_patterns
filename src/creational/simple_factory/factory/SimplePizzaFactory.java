package creational.simple_factory.factory;

import creational.simple_factory.pizza.CheesePizza;
import creational.simple_factory.pizza.ClamPizza;
import creational.simple_factory.pizza.PepperoniPizza;
import creational.simple_factory.pizza.Pizza;
import creational.simple_factory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
