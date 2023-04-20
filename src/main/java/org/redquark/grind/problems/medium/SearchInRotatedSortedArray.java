package org.redquark.grind.problems.medium;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Find the pivot index
        while (left < right) {
            // Find the middle index
            int middle = left + (right - left) / 2;
            // Compare the number at the middle index with the element
            // at the end of the array, if it is greater, then it means
            // pivot is in the right half of the array, else in the left
            // half of the array
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        // At this point, left index is the pivot index
        int pivot = left;
        // Reset left and right pointers
        left = 0;
        right = n - 1;
        // Now, we will determine in which half of the array, our
        // target is present
        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot;
        }
        // Perform traditional binary search
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
