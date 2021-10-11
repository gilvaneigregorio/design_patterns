package behavioral.strategy.behaviors.quack;

public class RegularQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
