import util.ListNodes;
import static util.ListNodes.sizeToList;

import datastructs.linkedlist.LinkedList;

public class MiddleNode {
	
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5]
        System.out.println(ListNodes.toString(middleNode(sizeToList(5)))); // [3, 4, 5]
        // [1, 2, 3, 4, 5, 6]
        System.out.println(ListNodes.toString(middleNode(sizeToList(6)))); // [4, 5, 6]
    }

    private static LinkedList<Integer> middleNode(LinkedList<Integer> head) {
        LinkedList<Integer> lastNode = head;
        LinkedList<Integer> middleNode = head;

        while (lastNode != null && lastNode.next() != null) {
            middleNode = middleNode.next();
            lastNode = lastNode.next().next();
        }

        return middleNode;
    }
}
