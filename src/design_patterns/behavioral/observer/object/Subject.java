package design_patterns.behavioral.observer.object;

import design_patterns.behavioral.observer.behaviors.Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
