package org.redquark.grind.problems.easy;

public class ConvertSortedArrayToBinarySearchTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n), depth of stack space
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return null;
        }
        // Create the tree
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // Middle index
        int middle = left + (right - left) / 2;
        // Create a new node
        TreeNode root = new TreeNode(nums[middle]);
        // Create left and right subtrees
        root.left = createTree(nums, left, middle - 1);
        root.right = createTree(nums, middle + 1, right);
        return root;
    }

    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
