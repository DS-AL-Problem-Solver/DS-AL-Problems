package com.dsalproblems.dsalproblems;

/**
 * This class merges two sorted input arrays and returns the sorted merged array.
 */
public class MergeArrays {

    /**
     * This method merges two sorted arrays.
     * Note: If the arrays are not sorted the result will not be sorted. This method doesn't verify if the input arrays
     * are sorted or not. Also, this method returns null if one of the arrays is null.
     *
     * @param a The first input array.
     * @param b The second input array.
     * @return The merged array. Will be sorted if the input arrays are sorted.
     */
    public int[] mergeArrays(int[] a, int[] b) {
        // Return null if any of the arrays is null.
        if (a == null || b == null) {
            return null;
        }

        // Proceed with merging
        int[] mergedArray = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < a.length && j < b.length; ) {
            if (a[i] < b[j]) {
                mergedArray[k] = a[i];
                i++;
            } else {
                mergedArray[k] = b[j];
                j++;
            }
            k++;
        }

        // If a is exhausted, put the elements of b in.
        if (i >= a.length) {
            for (; j < b.length; ++j) {
                mergedArray[k++] = b[j];
            }
        }

        // If b is exhausted, put the elements of a in.
        if (j >= b.length) {
            for (; i < a.length; ++i) {
                mergedArray[k++] = a[i];
            }
        }
        return mergedArray;
    }
}
