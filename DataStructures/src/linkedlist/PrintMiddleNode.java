package linkedlist;

import linkedlist.LinkedList.Node;

public class PrintMiddleNode {
//We are taking the User Defined Linked List from the LinkedList.java class

	public static void printMiddle(LinkedList list) {
		Node a = list.getFirst();
		Node b = list.getFirst();

		if (a == null)
			throw new IllegalStateException();

		while (b != list.getLast() && b.getNext() != list.getLast()) {
			a = a.getNext();
			b = b.getNext().getNext();
		}

		// System.out.println(a.val);

		if (b == list.getLast()) {
			System.out.println(a.getVal());
		} else {
			System.out.println(a.getVal() + " " + a.getNext().getVal());
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(100);
		list.addLast(200);
		list.addLast(300);
		list.addLast(400);
		list.addLast(500);
		// list.addLast(600);

		printMiddle(list);
		// list.display();
	}
}
