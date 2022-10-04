package org.redquark.grind.problems.medium;

public class MaximumSubarray {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int maxSubArray(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        // Variable to keep track of the global maximum sum
        int globalMax = nums[0];
        // Variable to keep track of the current subarray
        // maximum sum
        int localMax = nums[0];
        // Loop through every element in the array and apply
        // Kadane's algorithm
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], nums[i] + localMax);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
