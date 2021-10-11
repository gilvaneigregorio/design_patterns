package creational.abstract_factory.factory;

import creational.abstract_factory.ingredient.BlackOlives;
import creational.abstract_factory.ingredient.Cheese;
import creational.abstract_factory.ingredient.Clams;
import creational.abstract_factory.ingredient.Dough;
import creational.abstract_factory.ingredient.Eggplant;
import creational.abstract_factory.ingredient.FrozenClams;
import creational.abstract_factory.ingredient.MozzarellaCheese;
import creational.abstract_factory.ingredient.Pepperoni;
import creational.abstract_factory.ingredient.PlumTomatoSauce;
import creational.abstract_factory.ingredient.Sauce;
import creational.abstract_factory.ingredient.SlicedPepperoni;
import creational.abstract_factory.ingredient.Spinach;
import creational.abstract_factory.ingredient.ThickCrustDough;
import creational.abstract_factory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
