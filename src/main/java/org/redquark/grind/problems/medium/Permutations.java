package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        // List to store all the permutation
        List<List<Integer>> permutations = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return permutations;
        }
        // Perform backtracking
        backtrack(nums, new ArrayList<>(), permutations);
        return permutations;
    }

    private void backtrack(int[] nums, List<Integer> permutation, List<List<Integer>> permutations) {
        // If our index has reached the length of the nums, it means
        // we have encountered all the numbers for one combination
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }
        // For all the other permutations
        for (int num : nums) {
            // Skip if the list already contains the current number
            if (permutation.contains(num)) {
                continue;
            }
            // Add current element to the list
            permutation.add(num);
            // Backtrack on the next number
            backtrack(nums, permutation, permutations);
            // Remove the previously added element
            permutation.remove(permutation.size() - 1);
        }
    }
}
