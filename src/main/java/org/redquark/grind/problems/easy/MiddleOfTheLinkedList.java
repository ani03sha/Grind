package org.redquark.grind.problems.easy;

public class MiddleOfTheLinkedList {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public ListNode middleNode(ListNode head) {
        // Special case
        if (head == null || head.next == null) {
            return head;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until the fast pointer reaches the end
        while (fast != null && fast.next != null) {
            // Move slow pointer one step ahead
            slow = slow.next;
            // Move fast pointer two steps head
            fast = fast.next.next;
        }
        return slow;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
