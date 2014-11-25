package patterns.creational.singleton;

import java.util.Random;

public class DoubleCheckedLockingSigleton {
	private static volatile DoubleCheckedLockingSigleton instance;
	private static int instanceId;

	private DoubleCheckedLockingSigleton() {
		instanceId = new Random().nextInt(500);
	}

	public static DoubleCheckedLockingSigleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSigleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSigleton();
				}
			}
		}
		System.out.println("Instance id: " + instanceId);
		return instance;
	}
}
