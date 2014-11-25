package patterns.creational.singleton;

import java.util.Random;

/**
 * Not lazy singleton implementation
 * 
 * @author Ruslan
 * 
 */
public class NotLazySingleton {
	private static NotLazySingleton instance = new NotLazySingleton();
	private static int instanceId;

	private NotLazySingleton() {
		instanceId = new Random().nextInt(500);
	}

	public static NotLazySingleton getInstance() {
		System.out.println("Instance id: " + instanceId);
		return instance;
	}
}
