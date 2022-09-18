package org.redquark.grind.problems.easy;

public class DiameterOfBinaryTree {

    private int sum = 0;

    /**
     * Time complexity - O(n^2)
     * Space complexity - O(n)
     */
    public int diameterOfBinaryTreeBruteForce(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        // Get heights of left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        // Get the diameters of left and the right subtrees
        int leftDiameter = diameterOfBinaryTreeBruteForce(root.left);
        int rightDiameter = diameterOfBinaryTreeBruteForce(root.right);
        // The diameter will be max of
        // 1. Left diameter
        // 2. right diameter
        // 3. left height + right height (passing through root node)
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public int diameterOfBinaryTreeOptimized(TreeNode root) {
        // Special case
        if (root == null) {
            return 0;
        }
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Left and right heights
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        sum = Math.max(sum, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
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
