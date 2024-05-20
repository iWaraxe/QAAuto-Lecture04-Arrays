# Java - Arrays

Arrays in Java are a data structure that stores ordered collections of elements of a fixed size and specific type. In Java, an array is used to store a collection of data, but it is often useful to think of an array as a collection of variables of the same type.

Instead of declaring separate variables like `number0`, `number1`, ..., and `number99`, you declare one array variable, for example, `numbers` and use `numbers[0]`, `numbers[1]`, ..., and `numbers[99]` to represent individual variables.

## Example
The following code snippets show examples of this syntax:

```java
double[] myList; // Preferred way

or

double myList[]; // Works, but not the preferred way
```

The declaration of an array variable, creation, and assignment of the array reference can be combined into one statement as shown below:

```java
dataType[] arrayRefVar = new dataType[arraySize];
```

Alternatively, arrays in Java can be created as follows:

```java
dataType[] arrayRefVar = {value0, value1, ..., valuek};
```

Array elements are accessed through an index. The indices start from 0 and go up to `arrayRefVar.length - 1`.

### Example
The following statement declares an array variable `myList`, creates an array of 10 elements of type `double`, and assigns the reference `myList`:

```java
double[] myList = new double[10];
```

The image depicts the array `myList`. Here, `myList` has ten double values and indices from 0 to 9.

## Working with Arrays
When working with array elements, it is common to use a `for` loop or a `foreach` loop because all elements are of the same type and known size.

### Example
A complete example showing how to create, initialize, and process an array:

```java
public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }

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
```

Output:

```
1.9
2.9
3.4
3.5
Total is: 11.7
Max is: 3.5
```

## Foreach Loop
JDK 1.5 introduced a new loop, known as the `foreach` loop or enhanced `for` loop, which allows you to traverse the entire array without using an index variable.

### Example
The following code displays all the elements in the array `myList`:

```java
public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (double element: myList) {
         System.out.println(element);
      }
   }
}
```

Output:

```
1.9
2.9
3.4
3.5
```

## Passing Arrays to Methods
Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays the elements in an `int` array:

```java
public static void printArray(int[] array) {
  for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
  }
}
```

You can call this method by passing an array. For example, the following statement calls the `printArray` method to display `3, 1, 2, 6, 4, and 2`:

```java
printArray(new int[]{3, 1, 2, 6, 4, 2});
```

## Returning Arrays from Methods
A method can also return an array. For example, the method shown below returns an array that is the reversal of another array:

```java
public static int[] reverse(int[] list) {
  int[] result = new int[list.length];

  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
    result[j] = list[i];
  }
  return result;
}
```

## Example: Maximum Element of an Array
Simple ways to find the maximum number in an array in Java. First, let's use the `Math.max()` method.

```java
public class Test {

   public static void main(String[] args) {
      // Finding the maximum element in the array myArray of 4 double elements.
      double[] myArray = {11, 5.8, 11.1, 10.9};
        
      // Assigning the minimum double value to the max variable.
      double max = Double.MIN_VALUE;

      // Iterating through all elements of the array.
      for (int i = 0; i < myArray.length; i++) {
          // Assigning the maximum value to the max variable
          // by choosing the largest of the two values (the "old" value of max and the value of the element).
          max = Math.max(max, myArray[i]);
      }

      // Displaying the largest number in the array myArray.
      System.out.println("Max element in myArray: " + max);
   }
}
```

Output:

```
Max element in myArray: 11.1
```

## Example: Minimum Element of an Array

```java
public class Test {

   public static void main(String[] args) {
      // Finding the minimum value in the array myArray of 4 double elements.
      double[] myArray = {11, 5.8, 11.1, 10.9};
     
      // Assigning the value of the zero element to the min variable.
      double min = myArray[0];

      // Iterating through all elements of the array.
      for (int i = 1; i < myArray.length; i++) {
          // Comparing the value of the min variable with the values of the array element.
          // If the value of the array element is less than the value of the min variable,
          // then the new value of the min variable will be equal to the value of this element.
          if (myArray[i] < min) {
              min = myArray[i];
          }
      }

      // Displaying the smallest element of the array myArray.
      System.out.println("Min element in myArray: " + min);
   }
}
```

Output:

```
Min element in myArray: 5.8
```

## Example: Sum of Array Elements
In this example, let's see how to get the sum of array elements in Java.

```java
public class Test {

   public static void main(String[] args) {
      // Finding the sum of elements in the array myList of 5 double elements.
      double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};
      // Initializing the total variable.
      double total = 0;

      // Adding each element of the array to the total variable.
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }

      // Displaying the result on the screen.
      System.out.println("Sum of elements in myList: " + total);
   }
}
```

Output:

```
Sum of elements in myList: 34.9
```

In this example, we use the enhanced `for` loop to find the sum of the array.

```java
public class Test {

   public static void main(String[] args) {
      // Finding the sum of elements in the array myList of 5 double elements.
      double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};
      // Initializing the total variable.
      double total = 0;

      // Adding each element of the array to the total variable using the enhanced for loop.
      for (double element : myList) {
         total += element;
      }

      // Displaying the result on the screen.
      System.out.println("Sum of myList: " + total);
   }
}
```

## Example: Displaying an Array
In this example, let's see how to display an array on the screen in Java.

```java
public class Test {

   public static void main(String[] args) {
      // Displaying the array myArray of 5 double elements.
      double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

      // Displaying the array on the screen using the enhanced for loop.
      System.out.print("Displaying elements of myList: ");
      for (double element : myList) {
         System.out.print(element + ", ");
      }
      
