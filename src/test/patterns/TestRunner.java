package test.patterns;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.patterns.behavioral.TestCustomObserver;
import test.patterns.behavioral.TestStrategy;
import test.patterns.structural.TestDecorator;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestStrategy.class,
				TestCustomObserver.class, TestDecorator.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Number of runned test: " + result.getRunCount());
		if (result.wasSuccessful()) {
			System.out.println("All test are passed");
		}
	}
}