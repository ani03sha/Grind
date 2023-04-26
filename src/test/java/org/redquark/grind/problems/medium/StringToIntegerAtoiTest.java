package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerAtoiTest {

    private final StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();

    @Test
    public void testMyAtoi() {
        String s = "42";
        assertEquals(42, stringToIntegerAtoi.myAtoi(s));

        s = "   -42";
        assertEquals(-42, stringToIntegerAtoi.myAtoi(s));

        s = "4193 with words";
        assertEquals(4193, stringToIntegerAtoi.myAtoi(s));
    }
}