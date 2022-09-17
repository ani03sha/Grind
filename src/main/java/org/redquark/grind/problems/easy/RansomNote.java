package org.redquark.grind.problems.easy;

public class RansomNote {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // Special case
        if (ransomNote == null || ransomNote.isEmpty() || magazine == null || magazine.isEmpty()) {
            return false;
        }
        // Array to store the character frequencies
        int[] frequencies = new int[26];
        // Loop through the magazine string
        for (char c : magazine.toCharArray()) {
            frequencies[c - 'a']++;
        }
        // Loop through the ransomNote string
        for (char c : ransomNote.toCharArray()) {
            frequencies[c - 'a']--;
        }
        // Loop through the frequencies array and check if any
        // frequency is less than 0. If it is, it means that there
        // is some character which is in ransomNote but not in
        // the magazine
        for (int frequency : frequencies) {
            if (frequency < 0) {
                return false;
            }
        }
        return true;
    }
}
