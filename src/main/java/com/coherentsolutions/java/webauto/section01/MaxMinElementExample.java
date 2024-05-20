// File: com/coherentsolutions/java/webauto/section01/MaxMinElementExample.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates finding the maximum and minimum elements in an array in Java.
 */
public class MaxMinElementExample {

    public static void main(String[] args) {
        double[] myArray = {-11, -5.8, 11.1, 10.9};

        // Finding the maximum element
        double max = findMax(myArray);
        System.out.println("Max element in myArray: " + max);

        // Finding the minimum element
        double min = findMin(myArray);
        System.out.println("Min element in myArray: " + min);
    }

    /**
     * Finds and returns the maximum element in the given array.
     *
     * @param array the array to be searched
     * @return the maximum element
     */
    public static double findMax(double[] array) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    /**
     * Finds and returns the minimum element in the given array.
     *
     * @param array the array to be searched
     * @return the minimum element
     */
    public static double findMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
