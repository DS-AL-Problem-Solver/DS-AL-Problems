package com.dsalproblems.dsalproblems;

/**
 * Challenge
 Create an in-place version of Quicksort. You need to follow Lomuto Partitioning method.

 Guideline
 Instead of copying the array into multiple sub-arrays, use indices to keep track of the different sub-arrays. You can
 pass the indices to a modified partition method. The partition method should partition the sub-array and then return
 the index location where the pivot gets placed, so you can then call partition on each side of the pivot.

 Always select the last element in the 'sub-array' as a pivot.
 Partition the left side and then the right side of the sub-array.
 Print out the whole array at the end of every partitioning method.
 An array of length 1 or less will be considered sorted, and there is no need to sort or to print them.

 Since you cannot just create new sub-arrays for the elements, partition method will need to use another trick to keep
 track of which elements are greater and which are lower than the pivot.

 The In-place Trick

 If an element is lower than the pivot, you should swap it with a larger element on the left-side of the sub-array.
 Greater elements should remain where they are.
 At the end of the partitioning method, the pivot should be swapped with the first element of the right partition,
 consisting of all larger elements, of the sub-array.
 To ensure that you don't swap a small element with another small element, use an index to keep track of the small
 elements that have already been swapped into their "place".

 Lomuto-partitioning

 Input Format
 There will be two lines of input:

 n - the size of the array
 ar - the numbers of the array

 Output Format
 Print the entire array on a new line at the end of every partitioning method.

 Constraints
 1 <= n <= 5000
 -10000 <= x <= 10000, x in ar

 There are no duplicate numbers.

 Sample Input

 7
 1 3 9 8 2 7 5

 Sample Output

 1 3 2 5 9 7 8
 1 2 3 5 9 7 8
 1 2 3 5 7 8 9

 */

/**
 * This class holds the logic of performing quick sort in place.
 */
public class QuickSortInPlace {

    /**
     * This recursive method performs quick sort of the given array.
     *
     * @param start Start index of the sub-array.
     * @param end End index of the sub-array.
     * @param array The given array.
     * @return The sorted array.
     */
    public int[] performQuickSort(int start, int end, int[] array) {
        // Make the last element of the array the pivot and partition the array around that number.
        if ((end - start) < 1) {
            return array;
        }
        int pivot = array[end];
        int i = start;
        int j = end - 1;
        while (i <= j) {
            while (i > - 1 && array[i] < pivot) {
                i++;
            }
            while (j > - 1 && array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        }
        exchange(array, i, end);
        for (int index = 0 ; index < array.length ; ++index) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
        performQuickSort(start, j, array);
        performQuickSort(i+1, end, array);
        return array;
    }

    /**
     * This method exchanges the elements at index i and at index j of the given array.
     *
     * @param array Given array.
     * @param i Index i.
     * @param j Index j.
     */
    private void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
