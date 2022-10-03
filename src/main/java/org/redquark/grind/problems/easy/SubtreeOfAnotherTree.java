package org.redquark.grind.problems.easy;

public class SubtreeOfAnotherTree {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base cases
        if (subRoot == null) {
            // Since the subroot is null and every
            // null tree is a subtree of another tree,
            // we will return true
            return true;
        }
        if (root == null) {
            // If the parent tree is null, the no other
            // tree can be its subtree, hence we will
            // return false
            return false;
        }
        // If the values at the current nodes are same, then
        // we can proceed further to match the subtrees
        if (root.val == subRoot.val && matchTree(root, subRoot)) {
            return true;
        }
        // Recurse for the left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean matchTree(TreeNode t1, TreeNode t2) {
        // If both the nodes are null, then t2 is
        // a valid subtree of t1
        if (t1 == null && t2 == null) {
            return true;
        }
        // If any of the trees is empty, they cannot
        // be matched further
        if (t1 == null || t2 == null) {
            return false;
        }
        // If the values don't match, we will return false
        else if (t1.val != t2.val) {
            return false;
        }
        // Recurse for the left and right subtrees
        return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
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
