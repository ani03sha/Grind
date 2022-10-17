package org.redquark.grind.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.grind.problems.medium.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    public void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected, binaryTreeLevelOrderTraversal.levelOrder(root));

        root = new TreeNode(1);
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(1));
        assertEquals(expected, binaryTreeLevelOrderTraversal.levelOrder(root));

        assertEquals(Collections.emptyList(), binaryTreeLevelOrderTraversal.levelOrder(null));
    }
}