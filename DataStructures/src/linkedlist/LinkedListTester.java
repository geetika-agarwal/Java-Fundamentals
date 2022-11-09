package linkedlist;

public class LinkedListTester {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addLast(100);
		list.addLast(200);
		list.addLast(300);
		list.addLast(400);

		list.removeLast();
		list.removeFirst();

		list.display();

		list.indexOf(300);
		list.containElement(200);
	}
}
