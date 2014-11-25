package patterns.behavioral.observer.java;

import java.util.Observable;
import java.util.Random;

public class TemperatureProvider extends Observable {
	private double temperature;

	public void newTemperature() {
		this.temperature = new Random().nextInt(400)
				+ new Random().nextDouble();
		System.out.println("Temperature provider: temperature was updated!\n");
		super.setChanged();
		super.notifyObservers();
	}
	
	public double getTemperature(){
		return this.temperature;
	}
	public void run(){
		for (int i = 0; i<10; i++){
			newTemperature();
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
