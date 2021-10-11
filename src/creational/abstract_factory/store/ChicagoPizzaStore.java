package creational.abstract_factory.store;

import creational.abstract_factory.factory.ChicagoPizzaIngredientFactory;
import creational.abstract_factory.factory.PizzaIngredientFactory;
import creational.abstract_factory.pizza.CheesePizza;
import creational.abstract_factory.pizza.ClamPizza;
import creational.abstract_factory.pizza.PepperoniPizza;
import creational.abstract_factory.pizza.Pizza;
import creational.abstract_factory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
