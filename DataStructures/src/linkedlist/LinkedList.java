package linkedlist;

public class LinkedList {
	class Node {
		private int val;
		private Node next;

		public Node(int num) {
			this.val = num;
			this.next = null;
		}

		public int getVal() {
			return val;
		}

		public Node getNext() {
			return next;
		}
	}

	private Node First;
	private Node Last;

	public Node getFirst() {
		return First;
	}

	public Node getLast() {
		return Last;
	}

	public void addLast(int item) {
		Node node = new Node(item);

		if (First == null) {
			First = node;
			Last = node;
		} else {
			Last.next = node;
			Last = node;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);

		if (First == null) {
			First = Last = node;
		} else {
			node.next = First;
			First = node;
		}
	}

	public void addAfter(int pos, int item) {
		Node temp = new Node(item);
		Node temp1 = First;
		int counter = 0;
		while (counter != pos - 1) {
			temp1 = temp1.next;
			counter++;
		}
		Node next = temp1.next;
		temp1.next = temp;
		temp.next = next;
	}

	public boolean isEmpty() {
		return First == null;
	}

	public void removeFirst() {
		if (First == null)
			System.out.println("Linked List is empty");
		else
			First = First.next;
	}

	public void removeLast() {
		if (First == null)
			System.out.println("Linked List is empty");
		else {
			Node temp = First;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			Last = temp;
			Last.next = null;
		}
	}

	public int size() {
		int size = 0;
		Node temp = First;
		while (temp != null) {
			size++;
			temp = temp.next;
		}

		return size;
	}

	public void display() {
		Node temp = First;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void indexOf(int val) {
		int index = 0;
		if (First == null) {
			System.out.println("The list is empty");
		} else {
			Node temp = First;
			while (temp != null) {
				if (temp.val == val) {
					System.out.println("The index of " + val + " is: " + index);
					break;
				}
				temp = temp.next;
				index++;
			}
		}
	}

	public void containElement(int val) {
		if (First == null) {
			System.out.println("The List is empty");
		} else {
			Node temp = First;
			while (temp != null) {
				if (temp.val == val) {
					System.out.println("The " + val + " is present in the Linked List");
					return;
				}
				temp = temp.next;
			}
			System.out.println("The " + val + " is not present in the Linked List");
		}
	}

	public int[] convertToArray() {
		int[] arr = new int[this.size()];

		Node temp = First;
		int i = 0;
		while (temp != null) {
			arr[i] = temp.val;
			temp = temp.next;
			i++;
		}

		return arr;
	}

}
