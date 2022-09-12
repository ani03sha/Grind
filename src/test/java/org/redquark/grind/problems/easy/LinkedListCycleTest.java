package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.redquark.grind.problems.easy.LinkedListCycle.ListNode;

public class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void testHasCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        assertTrue(linkedListCycle.hasCycle(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertTrue(linkedListCycle.hasCycle(head));

        head = new ListNode(1);
        assertFalse(linkedListCycle.hasCycle(head));
    }
}