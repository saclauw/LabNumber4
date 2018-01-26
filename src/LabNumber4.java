/* Steven Clauw
 * LabNumber4 - Calculate the factorial of a number
 * 
 * The application will:
 *  - Prompt the user to enter an integer from 1 to 10
 *  - Display the factorial of the number entered by the user
 *  - Ask if the user wants to continue
 *  
 * BUILD SPECS
 * -User a for loop to calculate the factorial
 * -Assume that the user will enter an integer, but verify it's between 1 and 10
 * -Use the long type to store the factorial
 * -Continue only if the user agrees to
 * 
 * XTRA
 * -Test the application to find the integer for the highest factorial that can be
 * accurately calculated by this application, then modify the prompt so that it prompts
 * the user for a number from 1 to the highest integer returns, verification too
 * -use recursion to implement that factorial
 * 
 */

import java.util.Scanner;

public class LabNumber4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Welcome to the Factorial Calculator!");
	
	int userNum = 0;
	boolean validNum;
	long factorialValue = 1;
	String cont = "y";

	
	while (cont.equalsIgnoreCase("y")) {
	
	do { 
		System.out.print("Please enter a number between 1 and 10: ");
		if (scan.hasNextInt()) {
			userNum = scan.nextInt();
			validNum = true;
		} 
		if  ((userNum >= 1) && (userNum <=10)) {
			validNum = true;
		} else {
			System.out.print("Not a valid entry. ");
			validNum = false;
			scan.nextLine();
		}
	} while (!(validNum));
	
	for (int i = 1; i <= userNum; i++) {
		factorialValue = factorialValue * i;
	}	
		System.out.println("The factorial of " + userNum + " is " + factorialValue);
	
		factorialValue = 1;
	
	System.out.println("");
	System.out.print("Do you want to continue? (y/n): ");
	cont = scan.next();
	System.out.println("");
	if (!cont.equalsIgnoreCase("y")) {
		System.out.println("Goodbye!");
	}
	
	}
	
}
}
