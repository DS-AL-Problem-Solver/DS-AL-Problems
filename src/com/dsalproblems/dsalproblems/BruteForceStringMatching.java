package com.dsalproblems.dsalproblems;

/**
 * This class holds the logic of the brute force string matching algorithm.
 */
public class BruteForceStringMatching {
    /**
     * This method checks if a given pattern exits in a given text by using the brute force algorithm.
     *
     * @param text The given text.
     * @param pattern The given pattern.
     * @param textLength The length of the given text.
     * @param patternLength The length of the given pattern.
     * @return The index of the text where the pattern starts. This will return -1 if the pattern doesn't exist in the
     * text. -2 will be returned if there is anything wrong with the input.
     */
    public int findBruteForceMatch(String text, String pattern, int textLength, int patternLength) {
        // Wrong input if the text or the pattern is null
        if (text == null || pattern == null) {
            return -2;
        }
        // Wrong input if the given length of the text (or the pattern) doesn't match with the actual length of text
        // (or the pattern).
        if (text.length() != textLength || pattern.length() != patternLength) {
            return -2;
        }
        if (textLength < 0 || patternLength < 0) {
            return -2;
        }
        if (patternLength > textLength) {
            return -1;
        }
        boolean matchFound = false;
        for (int i = 0 ; i < textLength ; ++i) {
            int j = 0;
            for ( ; j < patternLength ; ++j) {
                if (!matchFound && (text.charAt(i+j) == pattern.charAt(j))) {
                    matchFound = true;
                    j++;
                }
                if (matchFound) {
                    if (textLength - i < patternLength) {
                        return -1;
                    }
                    if (!(text.charAt(i+j) == pattern.charAt(j))) {
                        matchFound = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j == patternLength) {
                return i;
            }
        }
        return -1;
    }
}
