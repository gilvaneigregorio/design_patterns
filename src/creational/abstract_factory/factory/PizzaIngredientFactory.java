package creational.abstract_factory.factory;

import creational.abstract_factory.ingredient.Cheese;
import creational.abstract_factory.ingredient.Clams;
import creational.abstract_factory.ingredient.Dough;
import creational.abstract_factory.ingredient.Pepperoni;
import creational.abstract_factory.ingredient.Sauce;
import creational.abstract_factory.ingredient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
