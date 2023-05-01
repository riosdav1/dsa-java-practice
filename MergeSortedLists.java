import entity.ListNode;
import util.ListNodes;
import static util.ListNodes.valuesToList;

public class MergeSortedLists {
    public static void main(String[] args) {
        System.out.println(ListNodes.toString(mergeTwoLists(valuesToList(1, 2, 4), valuesToList(1, 3, 4)))); // [1,1,2,3,4,4]
        System.out.println(ListNodes.toString(mergeTwoLists(valuesToList(), valuesToList()))); // []
        System.out.println(ListNodes.toString(mergeTwoLists(valuesToList(), valuesToList(0)))); // [0]
        System.out.println(ListNodes.toString(mergeTwoLists(valuesToList(1), valuesToList(2)))); // [1,2]
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode list3 = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list3.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                list3.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            list3 = list3.next;
        }

        if (list1 == null) {
            list3.next = list2;
        }

        if (list2 == null) {
            list3.next = list1;
        }

        return head.next;
    }
}
