package patterns.behavioral.observer.java;

public class Main {

	public static void main(String[] args) {
		TemperatureProvider temperatureProvider = new TemperatureProvider();
		CelciusObserver celciusObserver = new CelciusObserver(
				temperatureProvider);
		
		temperatureProvider.addObserver(celciusObserver);
		
		temperatureProvider.run();
	}
}
