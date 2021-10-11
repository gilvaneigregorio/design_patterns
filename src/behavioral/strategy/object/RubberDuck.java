package behavioral.strategy.object;

import behavioral.strategy.behaviors.fly.FlyNoWay;
import behavioral.strategy.behaviors.quack.Squeak;

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
