package org.redquark.grind.problems.easy;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Pointer to keep track of the previous node
        ListNode previous = null;
        // Pointer to keep track of the current node
        ListNode current = head;
        // Pointer to keep track of the next node
        ListNode next;
        // Loop through the linked list
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
