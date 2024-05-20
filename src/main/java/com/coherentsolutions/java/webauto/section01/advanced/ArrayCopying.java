// File: com/coherentsolutions/java/webauto/section01/advanced/ArrayCopying.java
package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.Arrays;

/**
 * This class demonstrates copying arrays using various methods in Java.
 */
public class ArrayCopying {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // Using System.arraycopy
        int[] copy1 = new int[original.length];
        System.arraycopy(original, 0, copy1, 0, original.length);
        System.out.println("Copy using System.arraycopy: " + Arrays.toString(copy1));

        // Using Arrays.copyOf
        int[] copy2 = Arrays.copyOf(original, original.length);
        System.out.println("Copy using Arrays.copyOf: " + Arrays.toString(copy2));

        // Using Arrays.copyOfRange
        int[] copy3 = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Copy using Arrays.copyOfRange: " + Arrays.toString(copy3));
    }
}
