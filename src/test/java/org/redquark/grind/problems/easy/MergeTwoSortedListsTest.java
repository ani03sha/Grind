package org.redquark.grind.problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.redquark.grind.problems.easy.MergeTwoSortedLists.ListNode;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void testMergeTwoLists() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode expected = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(1, expected.val);
        assertEquals(1, expected.next.val);
        assertEquals(2, expected.next.next.val);
        assertEquals(3, expected.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.val);
        assertEquals(4, expected.next.next.next.next.next.val);

        assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

        list2 = new ListNode(2);
        expected = mergeTwoSortedLists.mergeTwoLists(null, list2);
        assertEquals(2, expected.val);
        assertNull(expected.next);
    }
}