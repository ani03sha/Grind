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
        // Stack to store the left parentheses
        Stack<Character> lefts = new Stack<>();
        // Loop through every character in the input string
        for (char c : s.toCharArray()) {
            // If it is any of the left parentheses, we will
            // add it to the stack
            if (c == '(' || c == '{' || c == '[') {
                lefts.push(c);
            }
            // If the current character is any of the right
            // parentheses, we will check if the top of the
            // stack matches with the corresponding left
            // parentheses, we will pop it
            else if (!lefts.isEmpty() && c == ')' && lefts.peek() == '(') {
                lefts.pop();
            } else if (!lefts.isEmpty() && c == '}' && lefts.peek() == '{') {
                lefts.pop();
            } else if (!lefts.isEmpty() && c == ']' && lefts.peek() == '[') {
                lefts.pop();
            }
            // Found any invalid character
            else {
                return false;
            }
        }
        // For a balanced string, all left parentheses would be
        // popped out, and the stack would be empty
        return lefts.isEmpty();
    }
}
