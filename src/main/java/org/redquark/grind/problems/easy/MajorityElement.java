package org.redquark.grind.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int majorityElement(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("At least one element should be present in the array");
        }
        // Map to store the frequencies of every element in the array
        Map<Integer, Integer> frequencies = new HashMap<>();
        // Populate the frequencies map
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        // Loop through the frequencies map to see which element is the
        // majority element and return it
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() * 2 > nums.length) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Could not find any majority element");
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int majorityElementSpaceOptimized(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("At least one element should be present in the array");
        }
        // Variable to keep track of the majority element
        int majority = -1;
        // Number of times that majority element occurred
        int count = 0;
        // Loop through the array
        for (int num : nums) {
            // If the count is zero, then the current element will become the
            // majority element
            if (count == 0) {
                majority = num;
                count++;
            }
            // If the current element is equal to the majority element, then we
            // will increment the count else we will decrement it
            else if (majority == num) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
