package sample;

public class TernaryOperator {
	
	public static void main(String[] args) {
		int num = 45;
		
		String result = (num%5==0) ? "Divisible by 5" :
			"Not Divisible by 5";
		
		System.out.println(result); //Divisible by 5
	}
	
}
