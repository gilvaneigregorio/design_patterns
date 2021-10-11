package creational.factory_method.factory;

import creational.factory_method.pizza.CheesePizza;
import creational.factory_method.pizza.ClamPizza;
import creational.factory_method.pizza.PepperoniPizza;
import creational.factory_method.pizza.Pizza;
import creational.factory_method.pizza.VeggiePizza;

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
