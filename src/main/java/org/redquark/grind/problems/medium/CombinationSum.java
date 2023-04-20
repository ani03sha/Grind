package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // List to store all combinations
        List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return combinations;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Perform backtracking
        backtrack(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> combinations) {
        // Base case
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        // Loop through the remaining elements
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                // Choose the element
                combination.add(candidates[i]);
                // Perform backtracking with this combination
                // Duplicates are allowed, hence we are passing i instead of i + 1
                backtrack(candidates, target - candidates[i], i, combination, combinations);
                // Rejected the selected element
                combination.remove(combination.size() - 1);
            }
        }
    }
}
