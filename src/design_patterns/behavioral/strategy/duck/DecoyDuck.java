package design_patterns.behavioral.strategy.duck;

import design_patterns.behavioral.strategy.behaviors.fly.FlyNoWay;
import design_patterns.behavioral.strategy.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
