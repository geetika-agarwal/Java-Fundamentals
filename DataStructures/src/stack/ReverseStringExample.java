package stack;

import java.util.Stack;

class StringReverser {
	public String reverse(String input) {
		String reverse = "";
		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			stk.push(input.charAt(i));
		}

		while (!stk.isEmpty()) {
			reverse += stk.pop();
		}

		return reverse;
	}
}

public class ReverseStringExample {
	public static void main(String[] args) {
		String str = "abcd";

		StringReverser reverser = new StringReverser();
		String reverse = reverser.reverse(str);
		System.out.println("Reversed String is: " + reverse);
	}
}
