package stack;

import java.util.Stack;

class MinStack {
	private Stack<Integer> stk;
	private Stack<Integer> minStk;

	public MinStack() {
		stk = new Stack<Integer>();
		minStk = new Stack<Integer>();
	}

	public void push(int val) {
		if (minStk.isEmpty()) {
			minStk.push(val);
		} else {
			if (minStk.peek() > val)
				minStk.push(val);
			stk.push(val);
		}
	}

	public int pop() {
		if (minStk.peek() == stk.peek())
			minStk.pop();
		return stk.pop();
	}

	public int min() {
		return minStk.peek();
	}

	public void displayStack() {
		System.out.println(stk.toString());
	}

	public void displayMinStack() {
		System.out.println(minStk.toString());
	}
}

public class MinStackExample {
	public static void main(String[] args) {
		MinStack stk = new MinStack();

		stk.push(3);
		stk.push(5);
		stk.push(2);
		stk.push(1);
		stk.push(1);
		stk.push(-1);
		System.out.println(stk.min());
		stk.pop();
		System.out.println(stk.min());

		stk.displayStack();
		stk.displayMinStack();
	}
}
