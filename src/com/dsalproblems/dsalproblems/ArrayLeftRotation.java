package com.dsalproblems.dsalproblems;

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
