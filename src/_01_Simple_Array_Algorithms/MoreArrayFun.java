package _01_Simple_Array_Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] abcs = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };
		printStringArray(abcs);
		reverseStringArray(abcs);
		everyOtherString(abcs);
		randomStringArray(abcs);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStringArray(String[] array) {
		for (String i : array) {
			System.out.print(i);
		}
		System.out.println();
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
			System.out.print(array[k]);

		}
		System.out.println();
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOtherString(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i]);
			}
		}
		System.out.println();
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void randomStringArray(String[] array) {
		Collections.shuffle(Arrays.asList(array));
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

		}
		System.out.println();
	}
}
