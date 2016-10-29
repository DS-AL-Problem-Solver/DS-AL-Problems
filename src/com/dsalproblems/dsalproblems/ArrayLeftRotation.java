package com.dsalproblems.dsalproblems;

/**
 * Given an array of integers and a number, , perform left rotations on the array. Then print the updated array as a
 * single line of space-separated integers.

 Input Format

 The first line contains two space-separated integers denoting the respective values of n (the number of integers) and
 d (the number of left rotations you must perform). The second line contains space-separated integers describing the
 respective elements of the array's initial state.

 Constraints
 1 <= n <= 100000
 1 <= d <= n
 1 <= a[i] <= 1000000

 Output Format

 Print a single line of n space-separated integers denoting the final state of the array after performing d left
 rotations.

 Sample Input

 5 4
 1 2 3 4 5

 Sample Output

 5 1 2 3 4

 */

/**
 * This class holds the logic of performing left rotation on a given array.
 */
public class ArrayLeftRotation {

    /**
     * Peforms left rotation on the given array.
     *
     * @param array The given array.
     * @param arraySize The size of the array.
     * @param numRotations The number of rotations.
     * @return Array after the rotation is performed.
     */
    public int[] leftRotateArray(int[] array, int arraySize, int numRotations) {
        int[] newArray = new int[arraySize];
        for (int index = 0 ; index < arraySize ; ++index) {
            newArray[index] = array[(index + numRotations) % arraySize];
        }
        array = null;
        return newArray;
    }
}
