package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.grind.problems.easy.ReverseLinkedList.ListNode;

public class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    public void testReverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = reverseLinkedList.reverseList(head);
        assertEquals(5, expected.val);
        assertEquals(4, expected.next.val);
        assertEquals(3, expected.next.next.val);
        assertEquals(2, expected.next.next.next.val);
        assertEquals(1, expected.next.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        expected = reverseLinkedList.reverseList(head);
        assertEquals(2, expected.val);
        assertEquals(1, expected.next.val);

        assertNull(reverseLinkedList.reverseList(null));
    }
}