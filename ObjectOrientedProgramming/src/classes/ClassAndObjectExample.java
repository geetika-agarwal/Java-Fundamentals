//package classes;
//import java.util.Scanner;
//

//class Student {
//	
//	// Data members (Attributes)
//	int studentId;
//	String studentName;
//	int studentAge;
//	Scanner sc = new Scanner(System.in);
//	
//	// Member Function
//	public void acceptDetails() {
//		System.out.println("Enter the ID");
//		this.studentId = sc.nextInt();
//		System.out.println("Enter the Student Name");
//		this.studentName = sc.next();
//		System.out.println("Enter the Student Age");
//		this.studentAge = sc.nextInt();
//	}
//	
//	public void displayDetails() {
//		System.out.println("Student ID: " + this.studentId);
//		System.out.println("Student Name: " + this.studentName);
//		System.out.println("Student Age: " + this.studentAge);
//	}
//	
//}
//
//public class ClassAndObjectExample {
//	public static void main(String[] args) {
//		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		
//		student1.acceptDetails();
//		student1.displayDetails();
//		
//		student2.acceptDetails();
//		student2.displayDetails();
//		
//	}
//}
