package org.redquark.grind.problems.easy;

public class PalindromeNumber {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     * n being the digits in the x
     */
    public boolean isPalindromeBruteForce(int x) {
        if (x < 0) {
            return false;
        }
        String X = String.valueOf(x);
        // Left and right pointers
        int left = 0;
        int right = X.length() - 1;
        // Check for the palindrome string
        while (left <= right) {
            if (X.charAt(left) != X.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     * n being the digits in the x
     */
    public boolean isPalindromeOptimal(int x) {
        // Special case
        if (x < 0) {
            return false;
        }
        // Original number
        int original = x;
        // Reversed number
        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
