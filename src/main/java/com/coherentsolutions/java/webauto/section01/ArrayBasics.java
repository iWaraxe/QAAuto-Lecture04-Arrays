// File: com/coherentsolutions/java/webauto/section01/ArrayBasics.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates the basic usage of arrays in Java.
 */
public class ArrayBasics {

    public static void main(String[] args) {
        // Declaring arrays
        double[] myList1; // Preferred way
        double myList2[]; // Works, but not the preferred way

        // Initializing arrays
        double[] myList = new double[4];

        // Accessing array elements
        myList[0] = 1.9;
        myList[1] = 2.9;
        myList[2] = 3.4;
        myList[3] = 3.5;

        // Printing array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println(" ");

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is: " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is: " + max);
    }
}
