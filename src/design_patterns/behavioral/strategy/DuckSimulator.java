package design_patterns.behavioral.strategy;

import design_patterns.behavioral.strategy.behaviors.fly.FlyRocketPowered;
import design_patterns.behavioral.strategy.duck.DecoyDuck;
import design_patterns.behavioral.strategy.duck.MallardDuck;
import design_patterns.behavioral.strategy.duck.ModelDuck;
import design_patterns.behavioral.strategy.duck.RubberDuck;

public class DuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
