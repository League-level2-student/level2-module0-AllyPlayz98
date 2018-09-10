package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] sList = { "Olivia", "Julia", "Alex", "Apaara", "Wendy" };
		// 2. print the third element in the array
		System.out.println(sList[2]);
		// 3. set the third element to a different value
		sList[2] = "Alexa";
		// 4. print the third element again
		System.out.println(sList[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < sList.length; i++) {
			System.out.println(sList[i]);
		}
		// 6. make an array of 50 integers
		int[] iList = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < iList.length; i++) {
			int r = ran.nextInt(1500);
			iList[i] = r;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = 1500;
		for (int i = 0; i < iList.length; i++) {
			if (iList[i] < smallest) {
				smallest = iList[i];
				System.out.println(iList[i]);
			}
		}
		// 9 print the entire array to see if step 8 was correct
		System.out.println("My smallest number is..: " + smallest);
		for (int i = 0; i < iList.length; i++) {
			System.out.println(iList[i]);

		}
		// 10. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < iList.length; i++) {
			if (iList[i] > largest) {
				largest = iList[i];
				System.out.println(iList[i]);
			}
		}
		System.out.println("My largest number is..: " + largest);
	}
}
