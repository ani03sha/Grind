package org.redquark.grind.problems.easy;

public class SingleNumber {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int singleNumber(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("An array should have at least one element.");
        }
        // Variable to keep track of the cumulative XOR
        int xor = nums[0];
        // Loop through the remaining elements of the array
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
