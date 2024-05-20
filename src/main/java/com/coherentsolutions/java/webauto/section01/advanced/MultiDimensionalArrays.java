// File: com/coherentsolutions/java/webauto/section01/advanced/MultiDimensionalArrays.java
package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * This class demonstrates the usage of multidimensional arrays in Java.
 */
public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Printing the 2D array
        System.out.println("2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
