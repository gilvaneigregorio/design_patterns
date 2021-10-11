package behavioral.strategy.behaviors.quack;

public class FakeQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Qwak");
	}
}
