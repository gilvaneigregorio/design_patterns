package design_patterns.structural.decorator.decorators;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

