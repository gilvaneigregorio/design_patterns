package design_patterns.behavioral.strategy.behaviors.fly;

public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}