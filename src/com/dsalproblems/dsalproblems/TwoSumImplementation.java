package com.dsalproblems.dsalproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implements the TwoSum interface. This has two methods: store() and test().
 */
public class TwoSumImplementation implements TwoSum {
    /**
     * List of numbers.
     */
    List<Integer> mListOfNumbers = new ArrayList<>();
    /**
     * List of sum of pair of numbers.
     */
    List<Integer> mListOfSumPairs = new ArrayList<>();

    /**
     * Stores the input in an internal data structure.
     *
     * @param input Input value.
     */
    @Override
    public void store(int input) {
        mListOfSumPairs.addAll(mListOfNumbers.stream().map(mListOfNumber -> input + mListOfNumber).
                collect(Collectors.toList()));
        mListOfNumbers.add(input);
    }

    /**
     * Returns true if there is any pair of numbers in the internal data structure which
     * have sum @param val, and false otherwise.
     *
     * @param val Value to test.
     * @return True if there is any pair of numbers in the internal data structure which have sum equals to val. False
     * otherwise.
     */
    @Override
    public boolean test(int val) {
        return !mListOfSumPairs.isEmpty() && mListOfSumPairs.contains(val);
    }
}
