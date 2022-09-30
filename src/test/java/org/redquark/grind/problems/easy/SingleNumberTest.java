package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumber() {
        int[] nums = new int[]{2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));

        nums = new int[]{1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }
}