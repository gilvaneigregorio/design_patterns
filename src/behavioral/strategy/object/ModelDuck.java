package behavioral.strategy.object;

import behavioral.strategy.behaviors.fly.FlyNoWay;
import behavioral.strategy.behaviors.quack.RegularQuack;

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
