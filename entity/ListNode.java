package entity;

/**
 * This class is being defined w/o getters and setters to emulate LeetCode
 * entities.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
