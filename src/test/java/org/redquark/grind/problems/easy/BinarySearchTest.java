package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testSearchIterative() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, binarySearch.searchIterative(nums, target));

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        assertEquals(-1, binarySearch.searchIterative(nums, target));
    }

    @Test
    public void testSearchRecursive() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, binarySearch.searchRecursive(nums, target));

        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        assertEquals(-1, binarySearch.searchRecursive(nums, target));
    }
}