package behavioral.strategy.behaviors.quack;

public class Squeak implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
