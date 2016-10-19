package com.dsalproblems.main;

import com.dsalproblems.dsalproblems.ArrayReverse;
import com.dsalproblems.dsalproblems.BruteForceStringMatching;
import com.dsalproblems.dsalproblems.QuickSortInPlace;

import java.util.Scanner;

/**
 * The main class.
 */
public class Main {

    public static void main(String[] args) {
        //testArrayReverse();
        //testBruteForceStringMatching();
        testQuickSortInPlace();
    }

    /**
     * This method tests the array reverse logic.
     */
    private static void testArrayReverse() {
        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.reverseArray();
    }

    /**
     * This method tests the brute force string matching algorithm.
     */
    private static void testBruteForceStringMatching() {
        int result;
        BruteForceStringMatching bruteForceStringMatching = new BruteForceStringMatching();
        result = bruteForceStringMatching.findBruteForceMatch("ababaca", "aca", 7, 3);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch(null, null, 0, 0);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", null, 0, 0);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch(null, "somepattern", 0, 0);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "somepattern", 0, 0);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "somepattern", 8, 0);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "somepattern", 0, 11);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "somepattern", 8, 11);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "pattern", 8, 7);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "some", 8, 4);
        System.out.println("Result: " + result);
        result = bruteForceStringMatching.findBruteForceMatch("sometext", "texting", 8, 7);
        System.out.println("Result: " + result);
    }

    /**
     * This method tests the logic of the in place quick sort algorithm.
     */
    private static void testQuickSortInPlace() {
        String line;
        Scanner stdin = new Scanner(System.in);

        /* Taking the standard inputs */
        line = stdin.nextLine();
        line = line.trim();
        int arraySize;
        try {
            arraySize = Integer.parseInt(line);
            System.out.println("Array size: " + arraySize);
        } catch (NumberFormatException e) {
            System.out.println("Array size should be a number.");
            return;
        }

        if (arraySize < 1) {
            System.out.println("Array size has to be at least 1.");
        } else if (arraySize < 1 || arraySize > 5000) {
            System.out.println("Array size out of range.");
        } else {
			/* Array elements */
            if (!stdin.hasNextLine()) {
                System.out.println("Array elements should be input.");
            } else {
                line = stdin.nextLine();
                line = line.trim();
                String[] tokens = line.split(" ");

                System.out.println("Printing the input array");
                for (int index = 0 ; index < tokens.length ; ++index) {
                    System.out.print(tokens[index] + " ");
                }
                System.out.println();

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
                        if (num < -10000 || num > 10000) {
                            System.out.println("Element value out of range: " + num);
                            return;
                        } else {
                            array[index] = num;
                        }
                    }

                    QuickSortInPlace quickSortInPlace = new QuickSortInPlace();
                    int[] result = quickSortInPlace.performQuickSort(0, arraySize-1, array);
                    System.out.println("Printing the array after quick sort is done:");
                    for (int index = 0 ; index <= arraySize - 1 ; ++index) {
                        System.out.print(result[index] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
