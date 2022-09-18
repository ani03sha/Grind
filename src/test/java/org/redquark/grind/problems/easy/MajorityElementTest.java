package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    public void testMajorityElement() {
        int[] nums = new int[]{3, 2, 3};
        assertEquals(3, majorityElement.majorityElement(nums));

        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, majorityElement.majorityElement(nums));
    }

    @Test
    public void testMajorityElementSpaceOptimized() {
        int[] nums = new int[]{3, 2, 3};
        assertEquals(3, majorityElement.majorityElementSpaceOptimized(nums));

        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, majorityElement.majorityElementSpaceOptimized(nums));
    }
}