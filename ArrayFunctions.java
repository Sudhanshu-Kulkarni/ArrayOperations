//ArrayFunctions.java
// This class provides various array-related operations, such as separating even and odd numbers,
// finding the smallest difference between neighboring numbers, and converting between arrays and ArrayLists.

import java.util.*;

class ArrayFunctions{

	// Displays the elements of an ArrayList.
	public void display(ArrayList<Integer> array){
		System.out.println("Array is : "+array);
	}

	// Displays the index of the element with the minimum difference between neighboring numbers.
	public void displayIndex(int index){
		System.out.println("Min index is : "+index);
	}

	// Separates even and odd numbers from an array into two ArrayLists.
	public void oddEven(int[] array){
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		// Iterate through the array and classify numbers as even or odd.
		for(int i=0;i<array.length;i++){
			if(array[i] % 2 == 0){
				even.add(array[i]); // Add to even list
			}
			else{
				odd.add(array[i]); // Add to odd list
			}
		}
		// Display the lists of even and odd numbers.
		display(odd);
		display(even);
	}

	// Finds the two neighboring numbers with the smallest difference and returns the index of the first number.
	public void min(int[] array) {
	    int minIndex = 0; // Stores the index of the first number in the closest pair.
	    int minDifference = Integer.MAX_VALUE; // Initialize with the largest possible value.

	    // Iterate through the array to check neighboring elements.
	    for (int i = 0; i < array.length - 1; i++) {
	        int diff = Math.abs(array[i + 1] - array[i]); // Calculate absolute difference
	        if (diff < minDifference) {
	            minDifference = diff; // Update minimum difference
	            minIndex = i; // Store index of the first element in the closest pair
	        }
	    }
	    displayIndex(minIndex); // Output the index of the first element in the closest pair     
	}

	// Converts an array into an ArrayList.
	public ArrayList<Integer> arrayToArrayList(int[] array) {

	    ArrayList<Integer> list = new ArrayList<>();

	    // Add each element of the array to the ArrayList.
	    for (int num : array) {
	        list.add(num);
	    }
	    return list;  // Return the resulting ArrayList
	}

	// Converts an ArrayList back into an array.
	public int[] arrayListToArray(ArrayList<Integer> list) {

	    int[] array = new int[list.size()];
	    // Copy elements from ArrayList to the array.
	    for (int i = 0; i < list.size(); i++) {
	        array[i] = list.get(i);
	    }
	    return array; // Return the resulting array
	} 
}
	






