/**
 * 
 */
package org.cuatrovientos.functions;

import java.util.Random;

/**
 * @author luser
 *
 */
public class Functions {

	/**
	 * simple method, displays message on console
	 */
	public static void hello () {
		System.out.println("Hello method");
	}
	
	/**
	 * shows something param on console
	 * @param something
	 */
	public static void saidSomething (String something) {
		System.out.println(something);
	}
	
	/**
	 * show something on console n times
	 * @param something
	 * @param times
	 */
	public static void saidSomethingNTimes (String something, int times) {
		for (int i = 0; i< times;i++) {
			System.out.println(something);	
		}
	}
	
	/**
	 * returns a greeting
	 * @return greeting String
	 */
	public static String tellMeSomething () {
		String something = "Hello Return";
		
		return something;
	}
	
	/**
	 * Given a greet returns its length
	 * @param greet
	 * @return
	 */
	public static int greentLength(String greet) {
		int length = 0;
		length = greet.length();
		
		return length;
	}
	
	/**
	 * changes param object value
	 * then change is only visible within this method scope
	 * @param name
	 */
	public static void changeName (String name) {
		System.out.println("Your name is " + name);
		name = "Satan";
	}
	
	/**
	 * inits an array of numbers with random values.
	 * The arrays is passed by reference, so when the
	 * method is finished the array contains newly created values
	 * @param numbers array
	 */
	public static void initNumbersArray (int[] numbers) {
		Random random = new Random();
		
		for (int i=0;i< numbers.length;i++) {
			numbers[i] = random.nextInt(30);
		}
	} 
	
	/**
	 * displays array elements one by one
	 * @param numbers
	 */
	public static void displayArray (int [] numbers) {
		for (int i=0;i< numbers.length;i++) {
			System.out.println(i + ".- "  + numbers[i]);
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[10];
		String name = "God";
		
		Functions.changeName(name);
		
		System.out.println("Now your name is: " + name);
		
		Functions.initNumbersArray(numbers);
		Functions.displayArray(numbers);
	}

}
