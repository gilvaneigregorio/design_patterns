package design_patterns.structural.decorator;

import design_patterns.structural.decorator.decorators.Beverage;
import design_patterns.structural.decorator.decorators.DarkRoast;
import design_patterns.structural.decorator.decorators.Espresso;
import design_patterns.structural.decorator.decorators.HouseBlend;
import design_patterns.structural.decorator.decorators.Mocha;
import design_patterns.structural.decorator.decorators.Soy;
import design_patterns.structural.decorator.decorators.Whip;

public class ImplementationExample {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
 
		Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
 
		Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
