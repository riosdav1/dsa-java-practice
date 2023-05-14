import util.ListNodes;
import static util.ListNodes.valuesToList;

import datastructs.linkedlist.LinkedList;

public class MergeSortedLists {
	
    public static void main(String[] args) {
    	LinkedList<Integer> list1 = valuesToList(1, 2, 4);
    	LinkedList<Integer> list2 = valuesToList(1, 3, 4);
    	LinkedList<Integer> mergedList = mergeTwoLists(list1, list2);
        System.out.println(ListNodes.toString(mergedList)); // [1,1,2,3,4,4]

    	list1 = valuesToList();
    	list2 = valuesToList();
    	mergedList = mergeTwoLists(list1, list2);
        System.out.println(ListNodes.toString(mergedList)); // []

    	list1 = valuesToList();
    	list2 = valuesToList(0);
    	mergedList = mergeTwoLists(list1, list2);
        System.out.println(ListNodes.toString(mergedList)); // [0]
        
    	list1 = valuesToList(1);
    	list2 = valuesToList(2);
    	mergedList = mergeTwoLists(list1, list2);
        System.out.println(ListNodes.toString(mergedList)); // [1,2]
    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> head = new LinkedList<>(0);
        LinkedList<Integer> list3 = head;

        while (list1 != null && list2 != null) {
            if (list1.getData() < list2.getData()) {
                list3.add(list1.getData());
                list1 = list1.next();
            } else {
                list3.add(list2.getData());
                list2 = list2.next();
            }
        }

        if (list1 == null) {
            list3.add(list2);
        }

        if (list2 == null) {
            list3.add(list1);
        }

        return head.next();
    }
}
