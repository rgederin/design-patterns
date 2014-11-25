package test.patterns.behavioral;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import patterns.behavioral.observer.custom.CelciusObserver;
import patterns.behavioral.observer.custom.FahrenheitObserver;
import patterns.behavioral.observer.custom.Observer;
import patterns.behavioral.observer.custom.Subject;
import patterns.behavioral.observer.custom.TemperatureProvider;

public class TestCustomObserver {
	private static Subject subject;
	private static Observer celciusObserver;
	private static Observer fahrenheitObserver;

	@Before
	public void before() {
		subject = new TemperatureProvider();
		celciusObserver = new CelciusObserver(subject);
		fahrenheitObserver = new FahrenheitObserver(subject);
	}

	@After
	public void after() {
		subject = null;
		celciusObserver = null;
		fahrenheitObserver = null;
	}

	@Test
	public void testCorrectRegisterObserver() {
		boolean result = subject.registerObserver(celciusObserver);
		assertEquals(true, result);
		result = subject.registerObserver(fahrenheitObserver);
		assertEquals(true, result);
	}

	@Test
	public void testDuplicateRegisterObserver() {
		subject.registerObserver(celciusObserver);
		boolean result = subject.registerObserver(celciusObserver);
		assertEquals(false, result);
	}

	@Test
	public void testNullRegisterObserver() {
		boolean result = subject.registerObserver(null);
		assertEquals(false, result);
	}

	@Test
	public void testCorrectRemoveObserver() {
		subject.registerObserver(celciusObserver);
		boolean result = subject.removeObserver(celciusObserver);
		assertEquals(true, result);
	}

	@Test
	public void testNotExistedRemoveObserver() {
		subject.registerObserver(celciusObserver);
		boolean result = subject.removeObserver(fahrenheitObserver);
		assertEquals(false, result);
	}

	@Test
	public void testNullRemoveObserver() {
		boolean result = subject.removeObserver(null);
		assertEquals(false, result);
	}

	@Test
	public void testEmptyRemoveObserver() {
		boolean result = subject.removeObserver(celciusObserver);
		assertEquals(false, result);
	}

	@Test
	public void testNotifyObservers() {
		subject.registerObserver(celciusObserver);
		subject.registerObserver(fahrenheitObserver);
		if (subject instanceof TemperatureProvider){
			((TemperatureProvider) subject).newTemperature();
			double expected = ((TemperatureProvider) subject).getTemperature();
			double result = celciusObserver.getTemperature();
			assertEquals(expected, result, 0.00000000001);
			result = fahrenheitObserver.getTemperature();
			assertEquals(expected, result, 0.00000000001);
		}
	}

}
