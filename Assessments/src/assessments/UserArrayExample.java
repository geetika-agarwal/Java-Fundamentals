package assessments;

import java.util.Arrays;

class Array {
	private int[] arr;
	private int size = 0;

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
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void max() {
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Maximum element: " + max);
	}

	public void size() {
		System.out.println("Size of the Array: " + size);
	}

	public int get(int num) {
		return arr[num];
	}

	public void intersect(Array arr) {

		System.out.println("The intersection of the two arrays are: ");
		for (int i = 0; i < this.size; i++) {
			int temp = this.get(i);
			for (int j = 0; j < arr.size; j++) {
				if (temp == arr.get(j)) {
					System.out.print(temp + " ");
					break;
				}
			}
		}
	}

	public Array insertAt(int pos, int num) {
		Array arr1 = new Array();
		for (int i = 0; i < size; i++) {
			if (i == pos - 1) {
				arr1.insert(num);
			} else {
				arr1.insert(this.get(i));
			}
		}
		return arr1;
	}

	public void reverse() {
		System.out.println("The reversed Array is : ");
		for (int i = this.size - 1; i >= 0; i--) {
			System.out.print(this.get(i) + " ");
		}
		System.out.println();
	}
}

public class UserArrayExample {
	public static void main(String[] args) {
		Array arr = new Array();

		arr.size();
		arr.insert(100);
		arr.insert(200);
		arr.insert(300);
		arr.insert(400);
		arr.insert(500);
		arr.insert(600);
		arr.insert(100);
		arr.insert(200);
		arr.insert(300);
		arr.insert(400);
//		arr.size();
//		arr.display();
//		arr.max();

		Array arr1 = new Array();
		arr1.insert(100);
		arr1.insert(150);
		arr1.insert(200);
		arr1.insert(250);
		arr1.insert(300);
		// arr1.display();
		// arr1.size();

		// arr.intersect(arr1);

		arr = arr.insertAt(4, 350);
		arr.display();
		arr.size();
		arr.reverse();
	}
}
