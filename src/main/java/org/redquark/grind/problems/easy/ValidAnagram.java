package org.redquark.grind.problems.easy;

import java.util.Arrays;

public class ValidAnagram {

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(n)
     */
    public boolean isAnagramBruteForce(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty.");
        }
        // Basic check - lengths should be same
        if (s.length() != t.length()) {
            return false;
        }
        // Sort both the strings
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        s = new String(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        t = new String(tArray);
        // Check if both the strings are equal
        return s.equals(t);
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public boolean isAnagramOptimal(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty.");
        }
        // Basic check - lengths should be same
        if (s.length() != t.length()) {
            return false;
        }
        // Array to store the frequency of characters
        int[] frequencies = new int[26];
        // Loop through both the strings and increment the frequency
        // for every character in s and decrement the frequency for
        // every character in t.
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }
        // For anagrams, the frequencies array will have every frequency
        // equals to zero as every character in s would be cancelled by
        // corresponding character in t.
        for (int frequency : frequencies) {
            if (frequency != 0) {
                return false;
            }
        }
        return true;
    }
}
