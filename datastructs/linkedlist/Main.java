package datastructs.linkedlist;

import util.ListNodes;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(1);
		for (int i = 2; i < 6; i++) {
			list.add(i);
		}
		System.out.println(ListNodes.toString(list)); // [1, 2, 3, 4, 5]
		list.remove(3);
		System.out.println(ListNodes.toString(list)); // [1, 2, 3, 5]
		System.out.println(ListNodes.toString(list.get(3))); // [5]
	}

}
