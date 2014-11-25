package test.patterns.creational;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import patterns.creational.singleton.ClassicSingleton;
import patterns.creational.singleton.SynchronizedAccessorSingleton;

public class TestSingleton {
	private static ClassicSingleton classicSingleton;
	private static SynchronizedAccessorSingleton synchronizedAccessorSingleton;

	@BeforeClass
	public static void before() {
		classicSingleton = ClassicSingleton.getInstance();
		synchronizedAccessorSingleton = SynchronizedAccessorSingleton
				.getInstance();
	}

	@Test
	public void testClassicSingleton1() {
		int expected = classicSingleton.getInstanceId();
		classicSingleton = ClassicSingleton.getInstance();
		int actual = classicSingleton.getInstanceId();
		assertEquals(expected, actual);

	}

	@Test
	public void testClassicSingleton2() {
		int expected = 10101;
		classicSingleton.setInstanceId(expected);
		classicSingleton = ClassicSingleton.getInstance();
		int actual = classicSingleton.getInstanceId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSynchronizedAccessorSingleton1() {
		int expected = synchronizedAccessorSingleton.getInstanceId();
		synchronizedAccessorSingleton = SynchronizedAccessorSingleton
				.getInstance();
		int actual = synchronizedAccessorSingleton.getInstanceId();
		assertEquals(expected, actual);

	}
}
