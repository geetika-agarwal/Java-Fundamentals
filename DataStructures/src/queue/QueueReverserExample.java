package queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

class QueueReverse {
	public static Queue reverser(Queue<Integer> queue, int k) {
		Queue<Integer> temp = new ArrayDeque<Integer>();
		int count = 0;
		Iterator<Integer> itr = queue.iterator();
		Stack<Integer> stk = new Stack<Integer>();

		while (itr.hasNext() && k != count) { // O(n)
			stk.push(queue.remove());
			count++;
		}

		while (!stk.isEmpty()) { // O(n)
			temp.add(stk.pop());
		}

		itr = queue.iterator();
		while (itr.hasNext()) { // O(n)
			temp.add(itr.next());
		}

		return temp;
	}
}

public class QueueReverserExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);

		queue = QueueReverse.reverser(queue, 4);
		System.out.println(queue.toString());
	}
}
