package org.redquark.grind.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Pointers to keep track of the longest window
        // without repeating characters
        int start = 0;
        int end = 0;
        // Set to store unique characters
        Set<Character> distinctCharacters = new HashSet<>();
        // Longest length of substring with no
        // repeating character
        int longestLength = 0;
        // Loop until we reach the end of the string
        while (end < s.length()) {
            if (distinctCharacters.add(s.charAt(end))) {
                end++;
            } else {
                distinctCharacters.remove(s.charAt(start));
                start++;
            }
            // Update the longest length, if required
            longestLength = Math.max(longestLength, distinctCharacters.size());
        }
        return longestLength;
    }
}
