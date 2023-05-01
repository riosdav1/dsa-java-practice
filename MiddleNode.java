import entity.ListNode;
import util.ListNodes;
import static util.ListNodes.sizeToList;

public class MiddleNode {
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5]
        System.out.println(ListNodes.toString(middleNode(sizeToList(5)))); // [3, 4, 5]
        // [1, 2, 3, 4, 5, 6]
        System.out.println(ListNodes.toString(middleNode(sizeToList(6)))); // [4, 5, 6]
    }

    private static ListNode middleNode(ListNode head) {
        ListNode lastNode = head;
        ListNode middleNode = head;

        while (lastNode != null && lastNode.next != null) {
            middleNode = middleNode.next;
            lastNode = lastNode.next.next;
        }

        return middleNode;
    }
}
