package com.dsalproblems.dsalproblems;

/**
 * Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence
 * "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences
 * constructed by using every letter of the alphabet at least once.)
 * After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.
 * Given a sentence s, tell Roy if it is a pangram or not.
 * <p>
 * Input Format:
 * Input consists of a string s.
 * <p>
 * Constraints:
 * Length of s can be at most 10^3 (1 <= s <= 10^3) and it may contain spaces, lower case and upper case letters.
 * Lower-case and upper-case instances of a letter are considered the same.
 * <p>
 * Output Format:
 * Output a line containing pangram if s is a pangram, otherwise output not pangram.
 * <p>
 * Sample Input:
 * Input #1
 * We promptly judged antique ivory buckles for the next prize
 * <p>
 * Input #2
 * We promptly judged antique ivory buckles for the prize
 * <p>
 * Sample Output:
 * <p>
 * Output #1
 * pangram
 * <p>
 * Output #2
 * not pangram
 * <p>
 * Explanation:
 * In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
 * <p>
 * The following class contains the logic to figure out if the given string is a pangram or not.
 */
public class Pangrams {

    /**
     * Figures out if the given string is a pangram.
     *
     * @param inputString The given string.
     * @return True if the input String is a pangram. False, otherwise.
     * @throws NullPointerException If the string supplied is null.
     */
    public boolean isPangram(String inputString) throws NullPointerException {
        if (inputString == null) {
            throw new NullPointerException("Input string cannot be null.");
        }
        // An empty string cannot be a pangram.
        if ("".equals(inputString))
            return false;
        inputString = inputString.trim();
        inputString = inputString.toLowerCase();
        // All characters of the input string.
        char[] allCharacters = inputString.toCharArray();
        // The array that hashes all the characters of the input string.
        int[] characterHash = new int[26];
        for (char c : allCharacters) {
            // Ignore the characters if not 'a' to 'z'.
            if (!(getArrayIndex(c) >= 0 && getArrayIndex(c) <= 25))
                continue;
            characterHash[getArrayIndex(c)]++;
        }
        // If any character is not present, the string is not a pangram.
        for (int i : characterHash) {
            if (i < 1)
                return false;
        }
        return true;
    }

    /**
     * Gets the index of the character in the array.
     * E.g.: 'a' should have index 0, 'b' index 1, 'c' index 2 and so on.
     *
     * @param c Input character.
     * @return Index of the character in the character hash.
     */
    private int getArrayIndex(char c) {
        return c - 'a';
    }
}
