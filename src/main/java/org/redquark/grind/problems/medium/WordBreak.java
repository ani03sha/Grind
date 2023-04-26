package org.redquark.grind.problems.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        // Special case
        if (s == null || s.isEmpty() || wordDict == null || wordDict.isEmpty()) {
            return false;
        }
        // Length of the string
        int n = s.length();
        // We will create a set of word dictionary so that we can
        // check whether a word is present in dictionary in O(1)
        Set<String> words = new HashSet<>(wordDict);
        // Lookup table to check if the word ending at the current index
        // is present in the dictionary or not
        boolean[] lookup = new boolean[n + 1];
        // Null/Empty string is always present in the dictionary
        lookup[0] = true;
        // Populate the remaining table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if the substring between index j and index i is present
                // in the dictionary or not
                if (lookup[j] && words.contains(s.substring(j, i))) {
                    lookup[i] = true;
                    break;
                }
            }
        }
        return lookup[n];
    }
}
