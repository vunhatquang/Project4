import java.util.Scanner;

/*
 * FILE: queryQuestion.java
 * AUTHORS: QUANG VU, QUAN NGUYEN, MINH TRAN
 * CLASS: CSC 460 FALL 2021
 * ASSIGNMENT: Project 4
 * PURPOSE: This file will answer query questions
 */

public class queryQuestions {
	/*
	 * This function will take in the scanner from the main menu that call it
	 * and use the scanner to work with JDBC
	 */
	public static void selection(Scanner input) {
		String option = "options";
		while (!option.toLowerCase().equals("back")) {
			if (!isOptionValid(option)) {
				System.out.println("Invalid input! Input can only be back, options, 1, 2, 3, 4"); // add more options here
                option = input.nextLine();
			} else if (option.equalsIgnoreCase("options")) {
				System.out.println("Basic Functionalities");
				System.out.println("Please select one option below");
				System.out.println("1. Display the user details whose Ids will expire given a date in format MM/DD/YYYY");
				System.out.println("2. Count every type of appointment and check how many of them got successful their IDs");
				System.out.println("3. Display the collected fee amount for every department for a given monthin the format MM/YYYY");
				System.out.println("4. ...");
				System.out.println("back to back to the main menu");
				option = input.nextLine();
			} else if (option.equalsIgnoreCase("1")) {
				 System.out.println("type in Date as  MM/DD/YYYY");
                 String date = input.nextLine();
                 while (!isFormatValid(date, "MM/DD/YYYY")) {
                         System.out.println("Date is not valid, type in Date as MM/DD/YYYY again!");
                         date = input.nextLine();
                 }
                 
                 // add function here
                 
                 option = "options";
                 
			}  else if (option.equalsIgnoreCase("3")) {
				 System.out.println("type in Date as  DD/YYYY");
                 String date = input.nextLine();
                 while (!isFormatValid(date, "DD/YYYY")) {
                         System.out.println("Date is not valid, type in Date as DD/YYYY again!");
                         date = input.nextLine();
                 }
                 
                 // add function here
                 
                 option = "options";
			}
		}
	}
	
	/*
	 * Check if useriput is valid
	 */
	private static boolean isOptionValid(String option) {
        String[] valid = new String[] {"back", "options", "1", "2", "3", "4"}; // add more options here
        for (String op: valid) {
                if (option.toLowerCase().equals(op))
                        return true;
        }
        return false;
	}
	
	/*
	 * Check if format is valid
	 */
	private static boolean isFormatValid(String input, String format) {
		if (format.equals("MM/DD/YYYY")) {
			// implement logic here
			return true;
		} else if (format.equals("MM/YYYY")) {
			// implement logic here
			return true;
		} else {
			return false;
		}
	}
}
