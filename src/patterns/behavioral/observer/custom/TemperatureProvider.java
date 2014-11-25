package patterns.behavioral.observer.custom;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class TemperatureProvider implements Subject, Runnable {
	private Set<Observer> observers;
	private double temperature;

	public TemperatureProvider() {
		this.observers = new LinkedHashSet<Observer>();
	}

	public TemperatureProvider(Set<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public boolean registerObserver(Observer observer) {
		if (observer == null && this.observers != null) {
			return false;
		}
		return this.observers.add(observer);
	}

	@Override
	public boolean removeObserver(Observer observer) {
		if (this.observers != null && !this.observers.contains(observer)) {
			return false;
		}
		return this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		if (this.observers == null) {
			return;
		}
		for (Observer observer : this.observers) {
			observer.update(this.temperature);
		}
	}

	public void newTemperature() {
		this.temperature = new Random().nextInt(400)
				+ new Random().nextDouble();
		System.out.println("Temperature provider: temperature was updated!\n");
		this.notifyObservers();
	}
	
	public double getTemperature(){
		return this.temperature;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.newTemperature();
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
