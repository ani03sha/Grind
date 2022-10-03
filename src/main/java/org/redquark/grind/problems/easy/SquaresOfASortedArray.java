package org.redquark.grind.problems.easy;

import java.util.Arrays;

public class SquaresOfASortedArray {

    /**
     * Time complexity - O(n * log(n))
     * Space complexity - O(1)
     */
    public int[] sortedSquaresBruteForce(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array tp store the squares
        int[] squares = new int[n];
        // Loop through the array
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }
        // Sort the squares array
        Arrays.sort(squares);
        return squares;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int[] sortedSquaresOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array to store the output
        int[] squares = new int[n];
        // Index to keep track of squares
        int index = n - 1;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop through the array until the pointers meet
        while (left <= right) {
            // Calculate the squares
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            // Compare the squares
            if (leftSquare > rightSquare) {
                squares[index] = leftSquare;
                left++;
            } else {
                squares[index] = rightSquare;
                right--;
            }
            index--;
        }
        return squares;
    }
}
