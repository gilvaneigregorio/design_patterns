package design_patterns.behavioral.strategy.duck;

import design_patterns.behavioral.strategy.behaviors.fly.FlyWithWings;
import design_patterns.behavioral.strategy.behaviors.quack.RegularQuack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new RegularQuack();
	}
 
	@Override
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
