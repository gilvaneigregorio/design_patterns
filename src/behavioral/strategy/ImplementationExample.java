package behavioral.strategy;

import behavioral.strategy.behaviors.fly.FlyRocketPowered;
import behavioral.strategy.object.DecoyDuck;
import behavioral.strategy.object.MallardDuck;
import behavioral.strategy.object.ModelDuck;
import behavioral.strategy.object.RubberDuck;

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
