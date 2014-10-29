/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic do while iteration
 * to calculate a square root
 * @author Pello Altadill
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int result = 1;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// loop until number is valid
		do {
			// Ask user for a number
			System.out.println("Enter a number: ");
			line = reader.nextLine();
		
			// Convert the String to int
			number = Integer.parseInt(line);
		
		} while (number < 0);
		
		// Calculate factorial		
		result = Math.sqrt(number);
		
		// Show result
		System.out.println("Square root is " + result);
	}

}
