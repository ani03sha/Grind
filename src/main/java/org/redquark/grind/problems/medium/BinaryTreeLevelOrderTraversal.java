package org.redquark.grind.problems.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List to store the level order traversal
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Queue to store the nodes
        Queue<TreeNode> nodes = new LinkedList<>();
        // Add root node to the queue
        nodes.offer(root);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Get the count of nodes at the current level
            int nodeCount = nodes.size();
            // List to store nodes at the current level
            List<Integer> currentLevelNodes = new ArrayList<>();
            // Traverse all the nodes at the current level
            for (int i = 0; i < nodeCount; i++) {
                // Get the current node
                TreeNode current = nodes.remove();
                // Add this node to the list
                currentLevelNodes.add(current.val);
                // Store left and right subtrees, if they are not null
                if (current.left != null) {
                    nodes.offer(current.left);
                }
                if (current.right != null) {
                    nodes.offer(current.right);
                }
            }
            // Add all current level nodes to the final list
            output.add(currentLevelNodes);
        }
        return output;
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
