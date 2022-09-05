package org.redquark.grind.problems.easy;

public class MergeTwoSortedLists {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1) (space for output list is not considered)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Special cases
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        // Dummy node
        ListNode dummy = new ListNode(-1);
        // Head of the new list
        ListNode head = null;
        // Pointers to traverse through both the lists
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        // Loop through the list until any of them is null
        while (temp1 != null && temp2 != null) {
            // Choose the node with lower value
            if (temp1.val < temp2.val) {
                if (head == null) {
                    head = temp1;
                }
                dummy.next = temp1;
                temp1 = temp1.next;
            } else {
                if (head == null) {
                    head = temp2;
                }
                dummy.next = temp2;
                temp2 = temp2.next;
            }
            dummy = dummy.next;
        }
        // Process the remaining nodes
        while (temp1 != null) {
            dummy.next = temp1;
            temp1 = temp1.next;
            dummy = dummy.next;
        }
        while (temp2 != null) {
            dummy.next = temp2;
            temp2 = temp2.next;
            dummy = dummy.next;
        }
        return head;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
