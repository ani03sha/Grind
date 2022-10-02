package org.redquark.grind.problems.easy;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode a, TreeNode b) {
        // Base condition
        if (a == null && b == null) {
            return true;
        }
        // For a tree to be symmetric following conditions need to be satisfied
        // 1. Data in both the nodes should be same
        // 2. Left subtree of left tree == Right subtree of right tree
        // 3. Right subtree of left tree == Left subtree of right tree
        if (a != null && b != null && a.val == b.val) {
            return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
        }
        return false;
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
