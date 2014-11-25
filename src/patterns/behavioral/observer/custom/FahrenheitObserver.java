package patterns.behavioral.observer.custom;

public class FahrenheitObserver implements Observer {
	private Subject subject;
	private double fahrenheitTemperature;
	private double obtainedTemperature;

	public FahrenheitObserver(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(double temperature) {
		this.obtainedTemperature = temperature;
		this.fahrenheitTemperature = temperature * 9 / 5 + 32;
		System.out.println("Fahrenheit Observer: received temperature: "
				+ temperature);
		System.out.println("Fahrenheit Observer: current temperature - "
				+ fahrenheitTemperature + " F\n");
	}

	@Override
	public double getTemperature() {
		return this.obtainedTemperature;
	}

	public boolean register() {
		return this.subject.registerObserver(this);
	}

	public boolean remove() {
		return this.subject.removeObserver(this);
	}
}
