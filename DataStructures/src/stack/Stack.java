package stack;

import java.util.EmptyStackException;

public class Stack {
	private int[] items;
	private int count;

	Stack() {
		items = new int[5];
		count = 0;
	}

	public void push(int num) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count] = num;
		count++;
	}

	public int pop() {
		if (count <= 0) {
			throw new EmptyStackException();
		}

		int ele = items[count - 1];
		count--;
		return ele;
	}

	public int size() {
		return count;
	}

	public void display() {
		int i;
		for (i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public int peek() {
		return items[count - 1];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == items.length;
	}
}
