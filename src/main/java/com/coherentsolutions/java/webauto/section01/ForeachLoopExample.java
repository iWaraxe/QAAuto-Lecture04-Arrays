// File: com/coherentsolutions/java/webauto/section01/ForeachLoopExample.java
package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates the use of the foreach loop to iterate through arrays in Java.
 */
public class ForeachLoopExample {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Using foreach loop to print all the array elements
        for (double element : myList) {
            System.out.println(element);
        }
    }
}
