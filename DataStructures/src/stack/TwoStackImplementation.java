package stack;

class TwoStack {
	private int[] arr;
	private int top1;
	private int top2;

	public TwoStack(int n) {
		arr = new int[n];
		top1 = (n / 2) - 1;
		top2 = n / 2;
	}

	public void push1(int num) {
		if (top1 < 0)
			throw new IllegalStateException();
		else
			arr[top1--] = num;
	}

	public void push2(int num) {
		if (top2 == arr.length)
			throw new IllegalStateException();
		else
			arr[top2++] = num;
	}

	public int pop1() {
		if (top1 == arr.length / 2 - 1)
			throw new IllegalStateException();
		return arr[++top1];
	}

	public int pop2() {
		if (top2 == arr.length / 2)
			throw new IllegalStateException();
		return arr[--top2];
	}

	public boolean isEmpty1() {
		return top1 == (arr.length / 2) - 1;
	}

	public boolean isEmpty2() {
		return top2 == arr.length / 2;
	}

	public boolean isFull1() {
		return top1 == -1;
	}

	public boolean isFull2() {
		return top2 == arr.length;
	}
}

public class TwoStackImplementation {
	public static void main(String[] args) {
		TwoStack stk = new TwoStack(9);
		stk.push1(100);
		stk.push1(200);
		stk.push1(300);
		stk.push1(400);
		System.out.println(stk.isFull1());
		System.out.println(stk.pop1());
		System.out.println(stk.pop1());
		System.out.println(stk.pop1());
		System.out.println(stk.pop1());
		// System.out.println(stk.pop1());
		System.out.println(stk.isEmpty1());

		stk.push2(100);
		stk.push2(200);
		stk.push2(300);
		stk.push2(400);
		stk.push2(500);
		System.out.println(stk.isFull2());
		System.out.println(stk.pop2());
		System.out.println(stk.pop2());
		System.out.println(stk.pop2());
		System.out.println(stk.isEmpty2());
		System.out.println(stk.pop2());
		System.out.println(stk.pop2());
		System.out.println(stk.isEmpty2());
	}
}
