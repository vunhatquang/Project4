import java.util.Scanner;

/*
 * FILE: BasicFunction.java
 * AUTHORS: QUANG VU, QUAN NGUYEN, MINH TRAN
 * CLASS: CSC 460 FALL 2021
 * ASSIGNMENT: Project 4
 * PURPOSE: This file will implement all the basic functionalities of the program
 */

public class BasicFunction {
	
	/*
	 * This function will take in the scanner from the main menu that call it
	 * and use the scanner to work with JDBC
	 */
	public static void selection(Scanner input) {
		String option = "options";
		while (!option.toLowerCase().equals("back")) {
			if (!isOptionValid(option)) {
				System.out.println("Invalid input! Input can only be back, options"); // add more options here
                option = input.nextLine();
			} else if (option.equalsIgnoreCase("options")) {
				System.out.println("Basic Functionalities");
				System.out.println("Please select one option below");
				System.out.println("1. ...");
				System.out.println("2. ...");
				System.out.println("back to back to the main menu");
				option = input.nextLine();
			} 
		}
	}
	
	
	/*
	 * Check if useriput is valid
	 */
	private static boolean isOptionValid(String option) {
        String[] valid = new String[] {"back", "options"}; // add more options here
        for (String op: valid) {
                if (option.toLowerCase().equals(op))
                        return true;
        }
        return false;
	}
}
