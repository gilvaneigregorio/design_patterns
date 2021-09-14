package design_patterns.behavioral.strategy.duck;

import design_patterns.behavioral.strategy.behaviors.fly.FlyWithWings;
import design_patterns.behavioral.strategy.behaviors.quack.RegularQuack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new RegularQuack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
