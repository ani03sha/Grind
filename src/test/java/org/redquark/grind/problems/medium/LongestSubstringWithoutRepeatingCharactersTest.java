package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
            new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testLengthOfLongestSubstring() {
        String s = "abcabcbb";
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));

        s = "bbbbb";
        assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));

        s = "pwwkew";
        assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));

        s = "";
        assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}