package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.grind.problems.easy.SubtreeOfAnotherTree.TreeNode;

public class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    public void testIsSubtree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));

        root.left.right.left = new TreeNode(0);
        assertFalse(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }
}