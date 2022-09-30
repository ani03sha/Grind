package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));

        strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }
}