/**
 * 
 */
package org.cuatrovientos.activitydiagrams;

import java.util.Scanner;

/**
 * Shows a basic for iteration to calculate factorial
 * @author Pello Altadill
 *
 */
public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int result = 1;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		// Ask user for a number
		System.out.println("Enter a number: ");
		line = reader.nextLine();
		
		// Convert the String to int
		number = Integer.parseInt(line);

		// Calculate factorial
		for (int i = number; i > 1; i++) {
			result = result * i;
		}
		
		// Show result
		System.out.println("Factorial is " + result);
	}

}
