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
        // Temp node to traverse through the merged list
        ListNode temp = new ListNode(-1);
        // Dummy node of the merged list
        ListNode dummy = temp;
        // Loop through both lists until either of them
        // becomes null
        while (list1 != null && list2 != null) {
            // Choose the node with lesser value from the
            // current nodes of the two lists
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        // Process remaining nodes
        while (list1 != null) {
            temp.next = new ListNode(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }
        while (list2 != null) {
            temp.next = new ListNode(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    static class ListNode {
        final int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
