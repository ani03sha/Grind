package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingBitsTest {

    private final CountingBits countingBits = new CountingBits();

    @Test
    public void testCountBits() {
        int n = 2;
        int[] expected = new int[]{0, 1, 1};
        assertArrayEquals(expected, countingBits.countBits(n));

        n = 5;
        expected = new int[]{0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, countingBits.countBits(n));
    }
}