// File: com/coherentsolutions/java/webauto/section01/DisplayArrayElements.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates displaying elements of an array in Java.
 */
public class DisplayArrayElements {

    public static void main(String[] args) {
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        // Displaying array elements using foreach loop
        System.out.print("Displaying elements of myList: ");
        displayArrayUsingForeach(myList);

        // Displaying array elements using for loop
        System.out.print("\nDisplaying elements of myList: ");
        displayArrayUsingForLoop(myList);
    }

    /**
     * Displays all elements of the given array using a foreach loop.
     *
     * @param array the array to be displayed
     */
    public static void displayArrayUsingForeach(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    /**
     * Displays all elements of the given array using a for loop.
     *
     * @param array the array to be displayed
     */
    public static void displayArrayUsingForLoop(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
