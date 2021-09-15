package design_patterns.behavioral.strategy;

import design_patterns.behavioral.strategy.behaviors.fly.FlyRocketPowered;
import design_patterns.behavioral.strategy.object.DecoyDuck;
import design_patterns.behavioral.strategy.object.MallardDuck;
import design_patterns.behavioral.strategy.object.ModelDuck;
import design_patterns.behavioral.strategy.object.RubberDuck;

public class ImplementationExample {
 
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
