// File: com/coherentsolutions/java/webauto/section01/ArrayMethodExamples.java
package com.coherentsolutions.java.webauto.section01;

import java.util.Arrays;

/**
 * This class demonstrates passing arrays to methods and returning arrays from methods in Java.
 */
public class ArrayMethodExamples {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 6, 4, 2};

        // Passing array to a method
        printArray(array);

        // Returning array from a method
        int[] reversedArray = reverse(array);
        printArray(reversedArray);
    }

    /**
     * Prints all elements of the given array.
     *
     * @param array the array to be printed
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Returns a new array which is the reverse of the given array.
     *
     * @param list the array to be reversed
     * @return the reversed array
     */
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
