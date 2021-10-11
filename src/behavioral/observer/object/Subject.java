package behavioral.observer.object;

import behavioral.observer.behaviors.Observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
