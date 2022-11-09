package queue;

public class ArrayQueueTester {
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);

		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);

		// System.out.println(queue);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		System.out.println("Elements of the queue are: ");
		queue.traverse();

		queue.peek();
		System.out.println("Is Queue Empty?: " + queue.isEmpty());
		System.out.println("Is Queue Full?: " + queue.isFull());
	}
}
