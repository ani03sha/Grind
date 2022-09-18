package org.redquark.grind.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean containsDuplicate(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Set to store the elements
        Set<Integer> elements = new HashSet<>();
        // Traverse the elements of the array
        for (int num : nums) {
            if (!elements.add(num)) {
                return true;
            }
        }
        return false;
    }
}
