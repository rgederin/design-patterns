package patterns.creational.singleton;

import java.util.Random;

/**
 * Singleton with inner class
 * 
 * @author Ruslan
 * 
 */
public class InnerClassSingleton {
	private static int instanceId;

	private InnerClassSingleton() {
		instanceId = new Random().nextInt(500);
	}

	private static class SingletonHolder {
		private static final InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		
		System.out.println("Instance :" + SingletonHolder.instance.toString()
				+ ", " + "Instance id: " + instanceId);
		return SingletonHolder.instance;
	}
}
