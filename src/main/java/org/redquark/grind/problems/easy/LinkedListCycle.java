package org.redquark.grind.problems.easy;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        // Special case
        if (head == null) {
            return false;
        }
        // Slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        // Loop until both the pointers meet
        while (fast != null && fast.next != null) {
            // Move slow pointer one step ahead
            slow = slow.next;
            // Move fast pointer two steps ahead
            fast = fast.next.next;
            // If both the pointers are equals, it means
            // there is a cycle in the list
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
