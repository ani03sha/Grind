package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {

    private final NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    public void testHammingWeight() {
        int n = Integer.parseInt("00000000000000000000000000001011", 2);
        assertEquals(3, numberOf1Bits.hammingWeight(n));

        n = Integer.parseInt("00000000000000000000000010000000", 2);
        assertEquals(1, numberOf1Bits.hammingWeight(n));
    }
}