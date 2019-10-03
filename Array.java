package FeetNumber;

import java.util.Scanner; 

/*
Mila 
Create a Java application that implements use of an int array.
 Use for loops to iterate through the array using the array’s 
 length variable to stay within the array bounds. Fill the array 
 with random numbers and print the array.

Array.java
*/
public class Array {

	public static void main(String[] args) {
		//create an array of 10 elements and fill with random numbers 
		int i = 10;
		int[] ar = new int [i];
		for (i=0; i<ar.length;i++) {
			ar[i]= (int)(Math.random() * 100);
}
		// Display the results
				System.out.println("This array includes: ");
				for ( i = 0; i < ar.length; i++) {
					System.out.println("The index is " +i + " the value of this index is " + ar[i]);
				}
	}

}
