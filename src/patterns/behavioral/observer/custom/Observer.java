package patterns.behavioral.observer.custom;

public interface Observer {
	/**
	 * Update observer
	 * 
	 * @param temperature
	 */
	public void update(double temperature);
	
	public double getTemperature();
}
