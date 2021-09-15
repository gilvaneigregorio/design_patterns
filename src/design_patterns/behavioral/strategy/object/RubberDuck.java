package design_patterns.behavioral.strategy.object;

import design_patterns.behavioral.strategy.behaviors.fly.FlyNoWay;
import design_patterns.behavioral.strategy.behaviors.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
