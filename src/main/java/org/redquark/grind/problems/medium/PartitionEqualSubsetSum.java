package org.redquark.grind.problems.medium;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // Length of the array
        int n = nums.length;
        // Find out the sum of all the elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If the sum is odd, there is no way we can partition
        // the array in two part with equal sum
        if (sum % 2 == 1) {
            return false;
        }
        // Lookup table to store if a combination of index and
        // current sum can lead to a valid partition
        Boolean[][] lookup = new Boolean[n + 1][sum + 1];
        // Find if the half sum is possible
        return isSumPossible(nums, n - 1, sum / 2, lookup);
    }

    private boolean isSumPossible(int[] nums, int index, int currentSum, Boolean[][] lookup) {
        // If we found the desired sum
        if (currentSum == 0) {
            return true;
        }
        // If current sum and index are out of bounds
        if (currentSum < 0 || index < 0) {
            return false;
        }
        // If we have already calculated this combination
        if (lookup[index][currentSum] != null) {
            return lookup[index][currentSum];
        }
        // Recursively call the updated currentSum for both cases -
        // when we choose the current element, or we don't choose.
        return lookup[index][currentSum] = isSumPossible(nums, index - 1, currentSum, lookup)
                || isSumPossible(nums, index - 1, currentSum - nums[index], lookup);
    }
}
