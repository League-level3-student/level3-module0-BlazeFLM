package _03_Intro_to_2D_Arrays;

import java.util.Random;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    		int[][] array2D = new int[3][3];
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    		for(int i = 0; i < array2D.length; i++) {
    			for(int k = 0; k < array2D[i].length; k++) {
    				array2D[i][k] = i + k;
    				System.out.print(array2D[i][k] + "\t");
    			}
    			System.out.println();
    		}
        // 3. print the third element from the second 1D array (2DArray[1][2])
    		System.out.println(array2D[1][2]);
        // 4. set the third element from the second 1D array to a different
        //    value
    		array2D[1][2] = new Random().nextInt(100);
        // 5. print the element again and verify the value has changed
    		System.out.println(array2D[1][2]);
    }
}
