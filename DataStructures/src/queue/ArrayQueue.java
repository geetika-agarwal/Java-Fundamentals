package queue;

import java.util.Arrays;

public class ArrayQueue {
	private int[] items;
	private int rear;
	private int front = -1;

	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}

	public void enqueue(int val) {
		if (front == -1)
			front++;
		if (rear == items.length)
			throw new IllegalStateException();
		items[rear++] = val;
	}

	public int dequeue() {
		if (front >= rear)
			throw new IllegalStateException();
		return items[front++];
	}

	public void traverse() {
		for (int i = front; i < rear; i++) {
			System.out.println(items[i]);
		}
	}

	public void peek() {
		System.out.println("The Element at the head is: " + items[front]);
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return rear == items.length;
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}
