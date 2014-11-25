package patterns.behavioral.observer.java;

import java.util.Observable;
import java.util.Observer;

public class CelciusObserver implements Observer {
	private Observable observable;
	private double celciusTemperature;
	private double obtainedTemperature;
	public CelciusObserver(Observable observable){
		this.observable = observable;
	}
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof TemperatureProvider){
			TemperatureProvider temperatureProvider = (TemperatureProvider)observable;
			this.obtainedTemperature = temperatureProvider.getTemperature() ;
			this.celciusTemperature = obtainedTemperature;
			System.out.println("Celcius Observer: received temperature: "
					+ obtainedTemperature);
			System.out.println("Celcius Observer: current temperature - "
					+ celciusTemperature + " C\n");
		}
		
	}
	
	
}
