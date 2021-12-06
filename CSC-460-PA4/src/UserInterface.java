import java.util.Scanner;

/*
 * FILE: UserInterface.java
 * AUTHORS: QUANG VU, QUAN NGUYEN, MINH TRAN
 * CLASS: CSC 460 FALL 2021
 * ASSIGNMENT: Project 4
 * PURPOSE: This file will create the interface for user to interact with database
 */

public class UserInterface {
	public static void main(String args[]) {
		String option = "options";
		Scanner input = new Scanner(System.in);
		while (!option.toLowerCase().equals("exit")) {
			if (!isOptionValid(option)) {
				System.out.println("Invalid input! Input can only be 1, 2, exit, options");
                option = input.nextLine();
			} else if (option.equalsIgnoreCase("options")) {
				System.out.println("Welcome to Department of Motor Vehicles (DMV)");
				System.out.println("Please select one option below");
				System.out.println("1. Basic Functionalities");
				System.out.println("2. Answer Queries Questions");
				System.out.println("Exit to exit program");
				option = input.nextLine();
			} else if (option.equalsIgnoreCase("1")) {
				BasicFunction.selection(input);
				option = "options";
			} else { // options = '2'
				
			}
		}
		input.close();
		System.out.println("Good Bye!");
		
	}
	
	private static boolean isOptionValid(String option) {
        String[] valid = new String[] {"1", "2", "exit", "options"};
        for (String op: valid) {
                if (option.toLowerCase().equals(op))
                        return true;
        }
        return false;
	}
}
