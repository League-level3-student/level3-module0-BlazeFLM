package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] abcs = {"A", "B", "C"};
		reverseStringArray(abcs);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStringArray(String[] array) {
		for (String i: array) {
			System.out.println(i);
		}
	}
	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseStringArray(String[] array) {
		int i, k;
		String t;
        for (i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }	
        for (k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
