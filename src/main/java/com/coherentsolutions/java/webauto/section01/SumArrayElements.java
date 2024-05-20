// File: com/coherentsolutions/java/webauto/section01/SumArrayElements.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates calculating the sum of all elements in an array in Java.
 */
public class SumArrayElements {

    public static void main(String[] args) {
        double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};

        // Calculating the sum using a for loop
        double total = calculateSum(myList);
        System.out.println("Sum of elements in myList: " + total);

        // Calculating the sum using a foreach loop
        total = calculateSumUsingForeach(myList);
        System.out.println("Sum of elements in myList using foreach: " + total);
    }

    /**
     * Calculates the sum of all elements in the given array using a for loop.
     *
     * @param array the array whose elements are to be summed
     * @return the sum of all elements
     */
    public static double calculateSum(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    /**
     * Calculates the sum of all elements in the given array using a foreach loop.
     *
     * @param array the array whose elements are to be summed
     * @return the sum of all elements
     */
    public static double calculateSumUsingForeach(double[] array) {
        double total = 0;
        for (double element : array) {
            total += element;
        }
        return total;
    }
}
