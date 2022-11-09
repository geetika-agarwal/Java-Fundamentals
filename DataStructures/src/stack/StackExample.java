package stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();

		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);

		for (Integer element : stk) {
			System.out.println(element);
		}

		System.out.println("Element popped is: " + stk.pop());

		for (Integer element : stk) {
			System.out.println(element);
		}

		System.out.println("Element ready to be popped: " + stk.peek());
	}
}
