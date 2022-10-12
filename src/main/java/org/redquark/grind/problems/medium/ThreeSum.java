package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /**
     * Time complexity - O(n ^ 2)
     * Space complexity - O(n)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // List to store the triplets
        List<List<Integer>> triplets = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return triplets;
        }
        // Length of the array
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Skip the duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Pointers for the current window
            int j = i + 1;
            int k = n - 1;
            // Perform binary search between the indices j and k
            while (j < k) {
                // Sum of the current three indices
                int sum = nums[i] + nums[j] + nums[k];
                // If the sum is 0, we have found our triplet
                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    // Avoid duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                // If the sum is less than 0, we are too left in the array,
                // therefore, we have to move right
                else if (sum < 0) {
                    j++;
                }
                // If the sum is greater than 0, we are too right in the array,
                // therefore, we have to move left
                else {
                    k--;
                }
            }
        }
        return triplets;
    }
}
