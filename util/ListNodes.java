package util;

import java.util.ArrayList;
import java.util.List;

import entity.ListNode;

public class ListNodes {

    public static String toString(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.toString();
    }

    public static ListNode valuesToList(int... values) {
        ListNode head = null;
        // {1} -> {2} -> {3} -> ...
        for (int i = values.length - 1; i > -1; i--) {
            head = new ListNode(values[i], head);
        }
        return head;
    }

    public static ListNode sizeToList(int size) {
        ListNode head = null;
        // {1} -> {2} -> {3} -> ...
        for (int i = size; i > 0; i--) {
            head = new ListNode(i, head);
        }
        return head;
    }
}
