package design_patterns.behavioral.strategy.duck;

import design_patterns.behavioral.strategy.behaviors.fly.FlyNoWay;
import design_patterns.behavioral.strategy.behaviors.quack.RegularQuack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new RegularQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
