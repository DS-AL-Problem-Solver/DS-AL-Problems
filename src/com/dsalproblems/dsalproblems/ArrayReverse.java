package com.dsalproblems.dsalproblems;

/**
 An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index, (where ), that can be referenced as (you may also see it written as ).

 Given an array, , of integers, print each element in reverse order as a single line of space-separated integers.

 Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

 Input Format

 The first line contains an integer, (the number of integers in ).
 The second line contains space-separated integers describing .

 Constraints

 Output Format

 Print all integers in in reverse order as a single line of space-separated integers.

 Sample Input

 4
 1 4 3 2

 Sample Output

 2 3 4 1
 */

import java.util.*;

/**
 * This class holds the logic of reversing a given array.
 */
public class ArrayReverse {

    /**
     * This method takes an input array from STDIN and reverses it.
     */
    public void reverseArray() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String line;
        Scanner stdin = new Scanner(System.in);

        /* Taking the standard inputs */
        line = stdin.nextLine();
        line = line.trim();
        int arraySize;
        try {
            arraySize = Integer.parseInt(line);
            //System.out.println("Array size: " + arraySize);
        } catch (NumberFormatException e) {
            System.out.println("Array size should be a number.");
            return;
        }

        if (arraySize < 1) {
            System.out.println("Array size has to be at least 1.");
        } else if (arraySize < 1 || arraySize > 1000) {
            System.out.println("Array size out of range.");
        } else {
			/* Array elements */
            if (!stdin.hasNextLine()) {
                System.out.println("Array elements should be input.");
            } else {
                line = stdin.nextLine();
                line = line.trim();
                String[] tokens = line.split(" ");

                //System.out.println("Printing the input array");
                for (int index = 0 ; index < tokens.length ; ++index) {
                    //System.out.print(tokens[index] + " ");
                }
                //System.out.println();

				/* Array size should match the number of elements */
                if (tokens.length != arraySize) {
                    System.out.println("Array size doesn't match the number of elements.");
                } else {
                    int[] array = new int[arraySize];
                    for (int index = 0; index <= arraySize -1 ; ++index) {
                        int num = 0;
						/* Each element has to be a number */
                        try {
                            num = Integer.parseInt(tokens[index]);
                        } catch (NumberFormatException e) {
                            System.out.println("Each element should be a number.");
                            return;
                        }
                        if (num < 1 || num > 10000) {
                            System.out.println("Element value out of range: " + num);
                            return;
                        } else {
                            array[index] = num;
                        }
                    }

                    //System.out.println("Printing the array in reverse order:");
                    printArrayReverse(array, arraySize);
                }
            }
        }
    }

    /**
     * Method that takes an integer array and prints it in the reverse order.
     */
    private void printArrayReverse(int[] array, int size) {
        try {
            for (int index = size-1 ; index >= 0 ; --index) {
                System.out.print(array[index] + " ");
            }
            //System.out.println();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong array index.");
        }
    }
}
