package queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

class QueueReverser {
	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stk = new Stack<Integer>();

		while (!queue.isEmpty()) {
			stk.push(queue.remove());
		}

		while (!stk.isEmpty()) {
			queue.add(stk.pop());
		}
	}
}

public class ReversedQueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();

		queue.add(100);
		queue.add(200);
		queue.add(300);
		System.out.println("Original Queue");
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		QueueReverser.reverse(queue);
		System.out.println("Reversed Queue");
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
