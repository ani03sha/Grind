package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.grind.problems.easy.ConvertSortedArrayToBinarySearchTree.TreeNode;

public class ConvertSortedArrayToBinarySearchTreeTest {

    private final ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();

    @Test
    public void testSortedArrayToBST() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode expected = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
        assertEquals(0, expected.val);
        assertEquals(-10, expected.left.val);
        assertEquals(5, expected.right.val);
        assertEquals(-3, expected.left.right.val);
        assertEquals(9, expected.right.right.val);

        nums = new int[]{1, 3};
        expected = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
        assertEquals(1, expected.val);
        assertEquals(3, expected.right.val);
    }
}