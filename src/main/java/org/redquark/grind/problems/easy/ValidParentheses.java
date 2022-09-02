package org.redquark.grind.problems.easy;

import java.util.Stack;

public class ValidParentheses {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean isValid(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Stack to store the left parenthesis.
        Stack<Character> lefts = new Stack<>();
        // Loop through every character of the string
        for (char c : s.toCharArray()) {
            // If the current character is any of the left parenthesis,
            // we will add it to the stack
            if (c == '(' || c == '{' || c == '[') {
                lefts.add(c);
            }
            // If the current character is any of the right parenthesis,
            // we will check if the top of the stack has the matching
            // left parenthesis. If so, we will pop that left parenthesis
            else if (c == ')' && !lefts.isEmpty() && lefts.peek() == '(') {
                lefts.pop();
            } else if (c == '}' && !lefts.isEmpty() && lefts.peek() == '{') {
                lefts.pop();
            } else if (c == ']' && !lefts.isEmpty() && lefts.peek() == '[') {
                lefts.pop();
            }
            // If nothing matches, we will return false
            else {
                return false;
            }
        }
        // Here, for valid parentheses, the stack should be empty
        return lefts.isEmpty();
    }
}
