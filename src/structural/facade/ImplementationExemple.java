package structural.facade;

public class ImplementationExemple {

	public static void main(String args[]) {
		ComputerFacade computer = new ComputerFacade(new Computer());
		computer.turnOn();
		computer.turnOff();
	}
}
