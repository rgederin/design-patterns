package patterns.creational.singleton;

import java.util.Random;

/**
 * Classic Singleton pattern implementation
 * 
 * @author Ruslan
 * 
 */
public class ClassicSingleton {

	private static ClassicSingleton instance;
	private int instanceId;

	private ClassicSingleton() {
		instanceId = new Random().nextInt(500);
	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}

	public int getInstanceId() {
		return this.instanceId;
	}
	
	public void setInstanceId(int instanceId){
		this.instanceId = instanceId;
	}
}
