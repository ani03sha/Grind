package org.redquark.grind.problems.easy;

public class AddBinary {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public String addBinary(String a, String b) {
        // Special cases
        if (a == null || a.isEmpty()) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }
        // String to store the sum of the binary strings
        StringBuilder sum = new StringBuilder();
        // Variable to keep track of the carry
        int carry = 0;
        // Variables to traverse strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Loop the strings and follow the basic addition of
        // current characters. We will loop the strings from
        // right to left.
        while (i >= 0 && j >= 0) {
            int currentSum = carry + a.charAt(i) - '0' + b.charAt(j) - '0';
            carry = currentSum / 2;
            sum.append(currentSum % 2);
            i--;
            j--;
        }
        // Loop for remaining characters
        while (i >= 0) {
            int currentSum = carry + a.charAt(i) - '0';
            carry = currentSum / 2;
            sum.append(currentSum % 2);
            i--;
        }
        while (j >= 0) {
            int currentSum = carry + b.charAt(j) - '0';
            carry = currentSum / 2;
            sum.append(currentSum % 2);
            j--;
        }
        // If there is still carry remaining
        if (carry != 0) {
            sum.append(carry);
        }
        return sum.reverse().toString();
    }
}
