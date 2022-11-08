package assessment_28_10;

import java.util.Arrays;

class Array {
	private int[] arr;
	int size = 0;

	public Array() {
		arr = new int[5];
	}

	public void insert(int num) {
		if (arr.length == size) {
			arr = Arrays.copyOf(arr, size * 2);
			arr[size] = num;
			size++;
		} else {
			arr[size] = num;
			size++;
		}
	}

	public void delete(int pos) {
		if (pos < 0 || pos > size) {
			System.out.println("Invalid Position");
			return;
		}
		for (int i = pos; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	public void display() {
		if (size == 0) {
			System.out.println("The Array is empty");
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class UserArrayExample {
	public static void main(String[] args) {
		Array arr = new Array();
		arr.insert(100);
		arr.insert(200);
		arr.insert(300);
		arr.insert(400);
		arr.insert(500);
		arr.insert(600);
		arr.delete(5);
		arr.display();
	}
}
