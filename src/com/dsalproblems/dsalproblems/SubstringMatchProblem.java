package com.dsalproblems.dsalproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two strings a, and b, determine if they share a common substring.
 * Input Format:
 * The first line contains a single integer, p, denoting the number of (a, b) pairs you must check.
 * Each pair is defined over two lines:
 * The first line contains string a.
 * The second line contains string b.
 * <p>
 * Constraints:
 * a and b consist of lowercase English letters only.
 * 1 <= p <= 10.
 * 1 <= |a|,|b| <= 10^5.
 * <p>
 * Output Format:
 * For each (a, b) pair of strings, print YES on a new line if the two strings share a common substring; if no such
 * common substring exists, print NO on a new line.
 * <p>
 * Sample Input
 * 2
 * hello
 * world
 * hi
 * world
 * <p>
 * Sample Output
 * YES
 * NO
 * <p>
 * Explanation:
 * We have c = 2 pairs to check:
 * a = "hello", b = "world". The substrings 'o' and 'l' are common to both a and b, so we print YES on a new line.
 * a = "hi", b = "world". Because a and b have no common substrings, we print NO on a new line.
 */
public class SubstringMatchProblem {

    /**
     * Matches two strings to find substrings of String a in String b. Gets a 'YES' if there is a match, and a 'NO' if
     * there is no match.
     *
     * @param a Input String a.
     * @param b Input String b.
     * @return True if any of the substrings of String a is contained in String b.
     */
    public boolean matchTwoStringsForCommonSubstring(String a, String b) {
        // Null check
        if (a == null || b == null) {
            return false;
        }

        // Emptiness check
        if (a.contentEquals("") || b.contentEquals("")) {
            return false;
        }

        for (int i = 1; i <= a.length(); ++i) {
            System.out.println(Arrays.toString(getSubstrings(i, a).toArray()));
        }

        for (int i = 1; i <= a.length(); ++i) {
            for (String eachSubstring : getSubstrings(i, a)) {
                if (b.contains(eachSubstring)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Gets substrings of the input string of the given length.
     *
     * @param length      Given length.
     * @param inputString Input string.
     * @return List of substrings.
     */
    private List<String> getSubstrings(int length, String inputString) {
        // Non-positive length check
        if (length <= 0) {
            return null;
        }

        // Null check
        if (inputString == null) {
            return null;
        }

        // Emptiness check
        if (inputString.contentEquals("")) {
            return null;
        }

        int stringLength = inputString.length();
        // Number of strings
        int numberOfSubstrings = stringLength - length + 1;

        // Creating list of substrings -> number of substrings, length of each substring
        List<String> substringList = new ArrayList<String>(numberOfSubstrings);

        for (int i = 0; i < numberOfSubstrings; ++i) {
            substringList.add(i, inputString.substring(i, i + length));
        }

        return substringList;
    }
}
