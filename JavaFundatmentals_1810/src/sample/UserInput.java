package sample;
import java.util.*;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		String name;
		float sal;
		
		name = sc.nextLine();
		no = sc.nextInt();
		sal = sc.nextFloat();
		
		System.out.println("Your number is:");
		System.out.println(no);
		System.out.println("Your name is:");
		System.out.println(name);
		System.out.println("Your salary is:");
		System.out.println(sal);
		
		sc.close();
	}
}
