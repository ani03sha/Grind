package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.grind.problems.easy.DiameterOfBinaryTree.TreeNode;

public class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    public void testDiameterOfBinaryTreeBruteForce() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTreeBruteForce(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(1, diameterOfBinaryTree.diameterOfBinaryTreeBruteForce(root));
    }

    @Test
    public void testDiameterOfBinaryTreeOptimized() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTreeOptimized(root));
    }
}