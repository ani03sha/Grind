package org.redquark.grind.problems.easy;

public class BinarySearch {

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public int searchIterative(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Left and right pointers
        int left = 0;
        int right = nums.length - 1;
        // Loop until the two pointers meet
        while (left <= right) {
            // Find the middle index of the window
            int middle = left + (right - left) / 2;
            // Check if the element at the middle index
            // is equal to the target
            if (nums[middle] == target) {
                return middle;
            }
            // If the element at the middle index is less
            // than the target, then we will check in the
            // right half of the array
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            // If the element at the middle index is greater
            // than the target, then we will check in the
            // left half of the array
            else {
                right = middle - 1;
            }
        }
        return -1;
    }

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(log(n)) - stack space
     */
    public int searchRecursive(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private int searchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        // Get the middle index
        int middle = left + (right - left) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] < target) {
            return searchRecursive(nums, target, middle + 1, right);
        } else {
            return searchRecursive(nums, target, left, middle - 1);
        }
    }
}
