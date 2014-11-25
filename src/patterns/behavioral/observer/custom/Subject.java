package patterns.behavioral.observer.custom;

public interface Subject {
	/**
	 * Register new observer in the Subject's list
	 * 
	 * @param observer
	 */
	public boolean registerObserver(Observer observer);

	/**
	 * Remove observer from the Subject's list
	 * 
	 * @param observer
	 */
	public boolean removeObserver(Observer observer);

	/**
	 * Notify all observers about changing in Subject
	 */
	public void notifyObservers();
	
	public void run();
}
