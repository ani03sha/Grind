package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.grind.problems.easy.MiddleOfTheLinkedList.ListNode;

public class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    public void testMiddleNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = middleOfTheLinkedList.middleNode(head);
        assertEquals(3, expected.val);

        head.next.next.next.next.next = new ListNode(6);
        expected = middleOfTheLinkedList.middleNode(head);
        assertEquals(4, expected.val);
    }
}