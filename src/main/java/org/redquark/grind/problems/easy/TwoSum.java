package org.redquark.grind.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Time complexity - O(n^2)
     * Space complexity - O(1)
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // Array to store the output
        int[] pair = new int[]{-1, -1};
        // Now, we will check for every combination of elements
        // to find if their sum is equal to the target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum is equal to the target
                if (nums[i] + nums[j] == target) {
                    pair[0] = i;
                    pair[1] = j;
                    return pair;
                }
            }
        }
        return pair;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int[] twoSumOptimized(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array should have minimum two elements.");
        }
        // Array to store the pair of element indices which satisfy
        // the two sum condition
        int[] pair = new int[]{-1, -1};
        // Map to store the compliments of every element in the array
        // with respect to the target. For e.g. for a valid pair a and
        // b, b = target - a. The key in the map will be the compliment
        // and the value would be the index of the element
        Map<Integer, Integer> compliments = new HashMap<>();
        // Loop through every element of the array
        for (int i = 0; i < nums.length; i++) {
            // Compliment of current element w.r.t target
            int compliment = target - nums[i];
            // Check if this compliment is already present
            // in the map of compliments
            if (compliments.containsKey(compliment)) {
                pair[0] = compliments.get(compliment);
                pair[1] = i;
                return pair;
            } else {
                // Add the current element to the map with its index
                compliments.put(nums[i], i);
            }
        }
        return pair;
    }
}
