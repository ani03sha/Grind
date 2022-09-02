package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void testTwoSumBruteForce() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSum.twoSumBruteForce(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, twoSum.twoSumBruteForce(nums, target));

        nums = new int[]{3, 4};
        target = 7;
        expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSum.twoSumBruteForce(nums, target));
    }

    @Test
    public void testTwoSumOptimized() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSum.twoSumOptimized(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, twoSum.twoSumOptimized(nums, target));

        nums = new int[]{3, 4};
        target = 7;
        expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSum.twoSumOptimized(nums, target));
    }
}