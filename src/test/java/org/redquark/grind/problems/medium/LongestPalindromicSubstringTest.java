package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindrome() {
        String s = "babad";
        assertEquals("aba", longestPalindromicSubstring.longestPalindrome(s));

        s = "cbbd";
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome(s));
    }
}