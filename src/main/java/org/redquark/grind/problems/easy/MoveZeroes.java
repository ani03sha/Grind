package org.redquark.grind.problems.easy;

public class MoveZeroes {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int[] moveZeroes(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Pointer to keep track of non-zero elements
        int index = 0;
        // Pointer to traverse the array
        int i = 0;
        // Loop through the array
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
            i++;
        }
        // Place zeroes in the remaining places
        for (i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
