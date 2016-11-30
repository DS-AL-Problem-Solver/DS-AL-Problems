package com.dsalproblems.dsalproblems;

/**
 * This class writes the logic to find out if there is matching parentheses in a given string.
 */
public class ParenthesesMatch {
    /**
     * This function determines if the braces ('(' and ')') in a string are properly matched.
     * it ignores non-brace characters.
     * Some examples:
     * "()()()()"   -> true
     * "((45+)*a3)" -> true
     * "(((())())"  -> false
     * "())(" -> false
     * "(((()" -> false
     * "())(()" -> false
     * "12345" -> false
     * "(12345)" -> true
     * <p>
     * NOTE: This method will return False if there are no braces in the string.
     *
     * @param s The input string.
     * @return True if parentheses match, False otherwise.
     * @throws NullPointerException
     */
    public boolean matched(String s) throws NullPointerException {
        // Implementation here
        if (s == null) {
            throw new NullPointerException("Input string cannot be null.");
        }

        if ("".equals(s)) {
            return false;
        }

        String inputString = s.trim();
        int length = inputString.length();
        int openCount = 0;
        boolean bracesOccurred = false;

        for (int i = 0; i < length; ++i) {
            //System.out.print(inputString.charAt(i) + "");
            //Ignore the non brace characters
            if (inputString.charAt(i) != '(' && inputString.charAt(i) != ')')
                continue;
            //Increase the count if open brace
            if (inputString.charAt(i) == '(') {
                openCount++;
                bracesOccurred = true;
            }
            //Decrease the count if close brace
            else if (inputString.charAt(i) == ')') {
                openCount--;
            }
            //Extra close brace isn't allowed
            if (openCount < 0) {
                return false;
            }

        }
        System.out.println();
        //System.out.println("Open count: " + openCount);
        //System.out.println("Braces occurred: " + bracesOccurred + "");
        // True if count is 0
        return openCount == 0 && bracesOccurred;
    }
}