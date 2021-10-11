package creational.singleton;

import creational.singleton.object.Singleton;

public class ImplementationExample {
 
	public static void main(String args[]) {
		Singleton singleton = Singleton.getInstance();
		System.out.println("Get Singleton instance "+singleton);
	}
}
