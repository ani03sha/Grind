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
        int[] pair = new int[2];
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
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // Array to store the output
        int[] pair = new int[2];
        // This Map will store the compliment of every
        // element in the array corresponding to the target.
        // For e.g., for a valid pair a, b, b = target - a.
        // The key would be the compliment and value would
        // be the index of the compliment
        Map<Integer, Integer> compliments = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Find compliment of the current element
            int compliment = target - nums[i];
            // If the compliment is already present in the
            // map, we have found our pair
            if (compliments.containsKey(compliment)) {
                // Get index of the compliment
                int indexOfCompliment = compliments.get(compliment);
                pair[0] = indexOfCompliment;
                pair[1] = i;
                return pair;
            }
            // If the compliment is not yet found, we will
            // store it with the index
            else {
                compliments.put(nums[i], i);
            }
        }
        return pair;
    }
}
