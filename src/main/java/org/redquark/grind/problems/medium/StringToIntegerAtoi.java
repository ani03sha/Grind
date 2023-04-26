package org.redquark.grind.problems.medium;

public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Index to traverse through the string
        int index = 0;
        // Remove leading whitespaces, if present
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        // To keep track if the number is negative
        boolean isNegative = false;
        // At this point, we may have a sign (-), (+), or nothing
        if (index < n && s.charAt(index) == '-') {
            isNegative = true;
            index++;
        } else if (index < n && s.charAt(index) == '+') {
            index++;
        }
        // Value to store the integer
        double intValue = 0;
        // Keep on looping until we are encountering digits
        while (index < n && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9) {
            intValue = intValue * 10 + s.charAt(index) - '0';
            index++;
        }
        intValue = isNegative ? -intValue : intValue;
        // Check if the value is out of bounds
        if (intValue > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (intValue < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) (intValue);
    }
}
