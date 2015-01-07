/**
 * 
 */
package org.cuatrovientos.diary;

import java.util.Date;
import java.util.Scanner;

/**
 * Main program with user "interface" to manage the diary
 * @author Pello Altadill
 * @greetz any
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variables for new entries
		Date date = new Date();
		String text = "";
		Entry entry = null;
		
		// variable to use in remove and read cases
		int index = 0;

		Scanner reader = new Scanner(System.in);
		String option = "";
		
		Diary diary = new Diary();
		
		
		do {
			System.out.println("------------ MyDiary --------------");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new entry");
			System.out.println("2. Remove entry");
			System.out.println("3. Read one entry");
			System.out.println("4. Show all entries");
			System.out.println("5. Exit");
			
			option = reader.nextLine();
			
			switch (option) {
				case "1":
						System.out.println("Please, enter text.");
						text = reader.nextLine();
						date = new Date();
						entry = new Entry(text,date);
						diary.addEntry(entry);
						break;
				case "2":
						System.out.println("Please, enter index number.");
						text = reader.nextLine();
						index = Integer.parseInt(text);
						diary.removeEntry(index);
						break;
				case "3":
						System.out.println("Please, enter index number.");
						text = reader.nextLine();
						index = Integer.parseInt(text);
						entry = diary.readEntry(index);
						if (null != entry) {
							System.out.println("Entry #" + index + "\n" + entry.show());
						}
						break;
				case "4":
						System.out.println(diary.readAll());
						break;
				case "5":
						System.out.println();
						System.out.println("Bye");
						break;
				default:
						System.out.println();
						System.out.println("TRY AGAIN");
						break;
			}
			
		} while (!option.equals("5"));
		
	}

}
