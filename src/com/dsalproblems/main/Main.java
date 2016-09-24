package com.dsalproblems.main;

import com.dsalproblems.dsalproblems.ArrayReverse;
import com.dsalproblems.dsalproblems.BruteForceStringMatching;

/**
 * The main class.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello!");
//        testArrayReverse();
        testBruteForceStringMatching();
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
}
