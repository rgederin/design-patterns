package patterns.creational.singleton;

import java.util.Random;

/**
 * Synchronized Accessor singleton
 * 
 * @author Ruslan
 * 
 */
public class SynchronizedAccessorSingleton {
	private static SynchronizedAccessorSingleton instance;
	private int instanceId;

	private SynchronizedAccessorSingleton() {
		instanceId = new Random().nextInt(500);
	}

	public static synchronized SynchronizedAccessorSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedAccessorSingleton();
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
