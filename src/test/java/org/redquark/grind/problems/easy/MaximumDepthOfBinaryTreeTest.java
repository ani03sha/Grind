package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.grind.problems.easy.MaximumDepthOfBinaryTree.TreeNode;

public class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    public void testMaxDepth() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(2, maximumDepthOfBinaryTree.maxDepth(root));
    }
}