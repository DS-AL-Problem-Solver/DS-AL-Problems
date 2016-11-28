package com.dsalproblems.dsalproblems;

/**
 * Alice wrote a sequence of words in CamelCase as a string of letters, s, having the following properties:
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given s, print the number of words in on a new line.
 *
 * Input Format:
 * A single line containing string s.
 *
 * Constraints:
 * 1 < = s <= 10^5
 *
 * Output Format:
 * Print the number of words in string .
 *
 * Sample Input:
 * saveChangesInTheEditor
 *
 * Sample Output:
 * 5
 *
 * Explanation:
 * String contains five words:
 * save
 * Changes
 * In
 * The
 * Editor
 *
 * Thus, we print on a new line.
 *
 * The following class devices a method that finds and prints the number of words in a CamelCase string.
 */
public class CamelCaseString {
    /**
     * Prints the number of words in a camel case string.
     * Note: If camel case isn't present then the method treats the entire string as a single string.
     *
     * @param inputString The given camel case string.
     * @throws NullPointerException Null pointer exception.
     */
    public void printNumberOfWords(String inputString) throws NullPointerException {
        if (inputString == null) {
            throw new NullPointerException("Input string cannot be null.");
        }

        inputString = inputString.trim();
        System.out.println("Input String: " + inputString);

        char[] allCharacters = inputString.toCharArray();
        System.out.println("Printing from character array: ");
        for (char k : allCharacters) {
        System.out.print(k);
        }
        System.out.println();

        int count = 0;
        int startIndex = 0;
        int endIndex = startIndex;
        for (int i = 0 ; i < allCharacters.length ; ++i) {
            if (Character.isUpperCase(allCharacters[i])) {
                System.out.println(inputString.substring(startIndex, endIndex));
                if (startIndex != endIndex) {
                    count++;
                    startIndex = endIndex;
                }
            }
            endIndex++;
        }

        if (allCharacters.length != 0) {
            System.out.println(inputString.substring(startIndex));
            count++;
        }
        System.out.println("Number of separate words: " + count);
    }
}
