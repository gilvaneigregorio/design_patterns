package behavioral.strategy.object;

import behavioral.strategy.behaviors.fly.FlyWithWings;
import behavioral.strategy.behaviors.quack.RegularQuack;

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
