package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 1. declare and Initialize an array 5 Strings
		String[] strings = new String[5];
		strings[0] = "1";
		strings[1] = "2";
		strings[2] = "3";
		strings[3] = "4";
		strings[4] = "5";
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "a different value";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "a string of your choice";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 7. make an array of 50 integers
		Integer[] ints = new Integer[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		for(int i = 0; i < ints.length; i++) {
			ints[i] = ran.nextInt(50);
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int min = ints[0];
		for(int i = 0; i < ints.length; i++) {
			if (ints[i] < min) {
				min = ints[i];
			}
		}
		System.out.println(min);
		// 10 print the entire array to see if step 8 was correct
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		// 11. print the largest number in the array.
		int max = ints[0];
		for(int i = 0; i < ints.length; i++) {
			if (ints[i] > max) {
				max = ints[i];
			}
		}
		System.out.println(max);
		// 12. print only the last element in the array
		System.out.println(ints[ints.length - 1]);
	}
}
