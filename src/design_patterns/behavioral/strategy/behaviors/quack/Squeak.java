package design_patterns.behavioral.strategy.behaviors.quack;

public class Squeak implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
