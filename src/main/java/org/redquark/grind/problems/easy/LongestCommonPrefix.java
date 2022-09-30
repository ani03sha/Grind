package org.redquark.grind.problems.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // StringBuilder to store the longest common prefix
        StringBuilder lcp = new StringBuilder();
        // Special cases
        if (strs == null || strs.length == 0) {
            return lcp.toString();
        }
        // Length to store the length of the smallest string
        // among all the strings in the array
        int smallestLength = Integer.MAX_VALUE;
        for (String str : strs) {
            smallestLength = Math.min(smallestLength, str.length());
        }
        // Loop through all the strings in the array until we find a
        // character mismatch
        for (int i = 0; i < smallestLength; i++) {
            // Current character
            char current = strs[0].charAt(i);
            // Check if this character is found in every string at the current index
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return lcp.toString();
                }
            }
            lcp.append(current);
        }
        return lcp.toString();
    }
}
