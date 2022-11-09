package stack;

public class StackTester {
	public static void main(String[] args) {
		Stack stk = new Stack();

		stk.push(100);
		stk.push(200);
		stk.push(300);
		stk.push(400);
		stk.push(500);

		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println("Size of Stack: " + stk.size());

		stk.push(600);
		stk.push(700);

		stk.display();
		System.out.println("Size of Stack: " + stk.size());
		System.out.println("Top Element of stack: " + stk.peek());
		System.out.println("Is Stack Full?: " + stk.isFull());
		System.out.println("Is Stack Empty?: " + stk.isEmpty());
	}
}
