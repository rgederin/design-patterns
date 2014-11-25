package patterns.behavioral.observer.custom;

public class Main {
	public static void main(String[] args) {
		Subject subject = new TemperatureProvider();
		// TemperatureProvider temperatureProvider = new TemperatureProvider();
		Observer celciusObserver = new CelciusObserver(subject);
		Observer fahrenheitObserver = new FahrenheitObserver(subject);

		subject.registerObserver(celciusObserver);
		subject.registerObserver(fahrenheitObserver);
		subject.run();
	}
}
