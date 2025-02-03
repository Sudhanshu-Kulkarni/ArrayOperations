//ArrayFunctions.java

import java.util.*;

class ArrayFunctions{
	public void display(ArrayList<Integer> array){
		System.out.println("Array is : "+array);
	}

	public void displayIndex(int index){
		System.out.println("Min index is : "+index);
	}

	public void oddEven(int[] array){
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for(int i=0;i<array.length;i++){
			if(array[i] % 2 == 0){
				even.add(array[i]);
			}
			else{
				odd.add(array[i]);
			}
		}
		display(odd);
		display(even);
	}

	public void min(int[] array) {
	    int minIndex = 0;
	    int minDifference = Integer.MAX_VALUE;

	    for (int i = 0; i < array.length - 1; i++) {
	        int diff = Math.abs(array[i + 1] - array[i]);  
	        if (diff < minDifference) {
	            minDifference = diff;
	            minIndex = i;
	        }
	    }
	    displayIndex(minIndex);     
	}

	public ArrayList<Integer> arrayToArrayList(int[] array) {
	    ArrayList<Integer> list = new ArrayList<>();
	    for (int num : array) {
	        list.add(num);
	    }
	    return list;
	}

	






