package patterns.behavioral.observer.custom;

public class CelciusObserver implements Observer {
	private Subject subject;
	private double celciusTemperature;
	private double obtainedTemperature;

	public CelciusObserver(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(double temperature) {
		this.obtainedTemperature = temperature;
		this.celciusTemperature = temperature;
		System.out.println("Celcius Observer: received temperature: "
				+ temperature);
		System.out.println("Celcius Observer: current temperature - "
				+ celciusTemperature + " C\n");
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
