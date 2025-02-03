//UserInput.java
// This class handles user input for the array operations. 
// It prompts the user to enter 5 numbers and stores them in an array.

import java.util.*;

class UserInput{
	// This method prompts the user to enter 5 numbers and stores them in an array.
	int[] arrayInput(){
		Scanner scan = new Scanner(System.in); // Create a Scanner object for user input
		int[] array = new int[5]; // Initialize an array to store 5 integers

		System.out.println("Enter 5 numbers : "); // Prompt the user to input numbers

		// Loop through and accept 5 numbers from the user
		for(int i=0; i < array.length; i++){
			array[i] = scan.nextInt(); // Read each integer input and store it in the array
		}

		return array; // Return the array containing the user's input
	}
}