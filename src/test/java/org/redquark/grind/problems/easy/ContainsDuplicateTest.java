package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void testContainsDuplicate() {
        int[] nums = new int[]{1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums));

        nums = new int[]{1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums));

        nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}