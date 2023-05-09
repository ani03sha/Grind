package org.redquark.grind.problems.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Start and end pointers to find out the window
        // of the longest palindromic substring
        int start = 0;
        int end = 0;
        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the longest odd length palindromic substring
            int oddLength = expandFromMiddle(s, i, i);
            // Get the longest even length palindromic substring
            int evenLength = expandFromMiddle(s, i, i + 1);
            // Max length
            int maxLength = Math.max(oddLength, evenLength);
            // Update the start and end indices
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromMiddle(String s, int left, int right) {
        // Special case
        if (left > right) {
            return 0;
        }
        // Loop through the string to check if the substring
        // between left and right indices is palindromic or not
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
