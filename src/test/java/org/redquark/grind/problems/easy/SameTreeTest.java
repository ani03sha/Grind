package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.grind.problems.easy.SameTree.TreeNode;

public class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    public void testIsSameTreeRecursive() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        assertTrue(sameTree.isSameTreeRecursive(p, q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        q = new TreeNode(1);
        q.right = new TreeNode(2);
        assertFalse(sameTree.isSameTreeRecursive(p, q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        assertFalse(sameTree.isSameTreeRecursive(p, q));
    }

    @Test
    public void testIsSameTreeIterative() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        assertTrue(sameTree.isSameTreeIterative(p, q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        q = new TreeNode(1);
        q.right = new TreeNode(2);
        assertFalse(sameTree.isSameTreeIterative(p, q));

        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        assertFalse(sameTree.isSameTreeIterative(p, q));
    }
}