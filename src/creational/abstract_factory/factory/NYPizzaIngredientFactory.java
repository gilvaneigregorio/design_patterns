package creational.abstract_factory.factory;

import creational.abstract_factory.ingredient.Cheese;
import creational.abstract_factory.ingredient.Clams;
import creational.abstract_factory.ingredient.Dough;
import creational.abstract_factory.ingredient.FreshClams;
import creational.abstract_factory.ingredient.Garlic;
import creational.abstract_factory.ingredient.MarinaraSauce;
import creational.abstract_factory.ingredient.Mushroom;
import creational.abstract_factory.ingredient.Onion;
import creational.abstract_factory.ingredient.Pepperoni;
import creational.abstract_factory.ingredient.RedPepper;
import creational.abstract_factory.ingredient.ReggianoCheese;
import creational.abstract_factory.ingredient.Sauce;
import creational.abstract_factory.ingredient.SlicedPepperoni;
import creational.abstract_factory.ingredient.ThinCrustDough;
import creational.abstract_factory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
