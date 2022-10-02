package org.redquark.grind.problems.easy;

public class MissingNumber {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int missingNumber(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        // Length of the array
        int n = nums.length;
        // Sum of all the elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (n * (n + 1) / 2) - sum;
    }
}
