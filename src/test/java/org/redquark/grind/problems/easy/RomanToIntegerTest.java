package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    public void testRomanToInt() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void testRomanToIntSpaceOptimized() {
        assertEquals(3, romanToInteger.romanToIntSpaceOptimized("III"));
        assertEquals(58, romanToInteger.romanToIntSpaceOptimized("LVIII"));
        assertEquals(1994, romanToInteger.romanToIntSpaceOptimized("MCMXCIV"));
    }
}