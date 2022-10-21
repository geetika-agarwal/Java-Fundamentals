package practice;

public class SumOfNumbersUsingLoops {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//for loop
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		// while
		sum = 0;
		int i = 0;
		while(i < arr.length) {
			sum = sum + arr[i];
			i++;
		}
		
		System.out.println(sum);
		
		// do...while
		sum = 0;
		i = 0;
		do {
			sum = sum + arr[i];
			i++;
		} while(i <= arr.length - 1);
		System.out.println(sum);
		
		// Enhanced loop
		sum = 0;
		for(int j: arr) {
			sum = sum + j;
		}
		System.out.println(sum);
	}
}
