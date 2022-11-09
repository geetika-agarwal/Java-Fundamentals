package queue;

class QueueUsingLinkedList {
	class Node {
		private int data;
		private Node next;

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node first;
	private Node last;
	private int size;

	public QueueUsingLinkedList() {
		first = last = null;
	}

	public void enqueue(int val) {
		Node temp = new Node(val);
		if (first == null) {
			first = last = temp;
			size++;
		} else {
			last.next = temp;
			last = temp;
			size++;
		}

	}

	public int dequeue() {
		if (first == null)
			throw new IllegalStateException();
		int temp = first.data;
		first = first.next;
		size--;
		return temp;
	}

	public int peek() {
		if (first == null)
			throw new IllegalStateException();
		return first.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return first == null;
	}
}

class QueueUsingLinkedListEx {
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println("--------------------------------");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(400);
		queue.enqueue(500);
		System.out.println("--------------------------------");
		System.out.println(queue.peek());
		System.out.println(queue.size());
	}
}