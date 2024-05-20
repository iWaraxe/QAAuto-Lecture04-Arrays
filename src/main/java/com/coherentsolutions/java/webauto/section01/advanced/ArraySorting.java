// File: com/coherentsolutions/java/webauto/section01/advanced/ArraySorting.java
package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Arrays;

/**
 * This class demonstrates sorting arrays using various methods in Java.
 */
public class ArraySorting {

    public static void main(String[] args) {
        int[] intArray = {3, 1, 2, 6, 4, 2};
        double[] doubleArray = {3.3, 1.1, 2.2, 6.6, 4.4, 2.2};

        // Sorting using Arrays.sort()
        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));

        Arrays.sort(doubleArray);
        System.out.println("Sorted doubleArray: " + Arrays.toString(doubleArray));
    }
}
