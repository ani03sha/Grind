package org.redquark.grind.problems.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class BackspaceStringCompare {

    /**
     * Time complexity - O(m + n)
     * Space complexity - O(m + n)
     */
    public boolean backspaceCompareBruteForce(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return Objects.equals(s, t);
        }
        // Strings after processing them
        String sProcessed = process(s);
        String tProcessed = process(t);
        return sProcessed.equals(tProcessed);
    }

    private String process(String s) {
        // We will add the characters in the stack if they are not followed
        // by a backspace character '#'
        Deque<Character> processedString = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '#' && !processedString.isEmpty()) {
                processedString.pop();
            } else if (c != '#') {
                processedString.push(c);
            }
        }
        return String.valueOf(processedString);
    }

    /**
     * Time complexity - O(m + n)
     * Space complexity - O(1)
     */
    public boolean backspaceCompareOptimal(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return Objects.equals(s, t);
        }
        // Indices to traverse s and t
        int i = s.length() - 1;
        int j = t.length() - 1;
        // Variables to keep track of the backspaces at once
        int backspacesInS = 0;
        int backspacesInT = 0;
        // Loop both the strings from right to left
        while (i >= 0 && j >= 0) {
            // Find position of next possible character in S
            while (i >= 0) {
                // If the current character is backspace then update
                // its count and decrement the index
                if (s.charAt(i) == '#') {
                    backspacesInS++;
                    i--;
                }
                // If the current character is a normal character but the
                // backspace count is not zero, we will skip this character
                else if (backspacesInS > 0) {
                    backspacesInS--;
                    i--;
                }
                // If there are no more corresponding backspaces for this character,
                // then we will include it in out final string
                else {
                    break;
                }
            }
            // Find position of next possible character in T
            while (j >= 0) {
                // If the current character is backspace then update
                // its count and decrement the index
                if (t.charAt(j) == '#') {
                    backspacesInT++;
                    j--;
                }
                // If the current character is a normal character but the
                // backspace count is not zero, we will skip this character
                else if (backspacesInT > 0) {
                    backspacesInT--;
                    j--;
                }
                // If there are no more corresponding backspaces for this character,
                // then we will include it in out final string
                else {
                    break;
                }
            }
            // Now, at this point compare the current characters
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            // Check if we are comparing a character in one string
            // with nothing in the other string
            if ((i >= 0) != (j >= 0)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
