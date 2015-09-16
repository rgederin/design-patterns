package test.patterns.structural;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import patterns.structural.decorator.example1.FileWriteLowerCaseStrategy;
import patterns.structural.decorator.example1.FileWriteUpperCaseStrategy;

public class TestDecoratorExample1 {
	private static final String FILE_NAME = "test.txt";
	private static FileWriteUpperCaseStrategy upperCaseStrategy; 
	private static FileWriteLowerCaseStrategy lowerCaseStrategy;
	
	@BeforeClass
	public static void beforeClass(){
		upperCaseStrategy = new FileWriteUpperCaseStrategy();
		lowerCaseStrategy = new FileWriteLowerCaseStrategy();
	}
	
	@AfterClass
	public static void afterClass(){
		upperCaseStrategy = null;
	}
	
	@Test
	public void testUpperCaseDecorator() {
		String text = "test for upper case";
		upperCaseStrategy.write(text, FILE_NAME);
		String result = readFile();
		String expected = text.toUpperCase();
		assertEquals(expected, result);
	}
	
	@Test
	public void testLowerCaseDecorator(){
		String text = "TEST for LOWER";
		lowerCaseStrategy.write(text, FILE_NAME);
		String result = readFile();
		String expected = text.toLowerCase();
		assertEquals(expected, result);
	}
	

	private String readFile() {
		StringBuilder stringBuilder = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					FILE_NAME));
			String line = bufferedReader.readLine();

			while (line != null) {
				stringBuilder.append(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			return stringBuilder.toString();
		}
	}
}