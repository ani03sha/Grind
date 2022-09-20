package org.redquark.grind.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int romanToInt(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        // Mappings of symbols and their values
        Map<Character, Integer> mappings = new HashMap<>();
        mappings.put('I', 1);
        mappings.put('V', 5);
        mappings.put('X', 10);
        mappings.put('L', 50);
        mappings.put('C', 100);
        mappings.put('D', 500);
        mappings.put('M', 1000);
        // Variable to keep store the total value of the roman numeral
        int value = 0;
        // Loop through every character of the string from right to end
        for (int i = s.length() - 1; i >= 0; i--) {
            // Get the current character and add its value to the final result
            value += mappings.get(s.charAt(i));
            // We will check the case where the previous character has smaller
            // value than the current character
            if (i > 0 && mappings.get(s.charAt(i - 1)) < mappings.get(s.charAt(i))) {
                value -= mappings.get(s.charAt(i - 1));
                i--;
            }
        }
        return value;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int romanToIntSpaceOptimized(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }
        // Variable to keep store the total value of the roman numeral
        int value = 0;
        // Loop through every character of the string from right to end
        for (int i = s.length() - 1; i >= 0; i--) {
            // Get the current character and add its value to the final result
            value += getNumericValue(s.charAt(i));
            // We will check the case where the previous character has smaller
            // value than the current character
            if (i > 0 && getNumericValue(s.charAt(i - 1)) < getNumericValue(s.charAt(i))) {
                value -= getNumericValue(s.charAt(i - 1));
                i--;
            }
        }
        return value;
    }

    private int getNumericValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid input");
        };
    }
}
