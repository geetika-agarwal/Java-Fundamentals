package Assessment;

import java.util.Scanner;

class Student {
	private int admno;
	private String sname;
	private float eng, math, science;
	private float total;
	static String course;
	static String University;
	
	static {
		Student.course = "Computer Science";
		Student.University = "JNTU - H";
	}
	
	private float ctotal() {
		return eng + math + science;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void takeData() {
		
		System.out.println("Enter the admission number: ");
		this.admno = sc.nextInt();
		System.out.println("Enter the student name: ");
		this.sname = sc.next();
		System.out.println("Enter english marks: ");
		this.eng = sc.nextFloat();
		System.out.println("Enter maths marks");
		this.math = sc.nextFloat();
		System.out.println("Enter science marks: ");
		this.science = sc.nextFloat();
		
		this.total = ctotal();
	}
	
	public void showData() {
		System.out.println("Admission Number: " + this.admno);
		System.out.println("Student Name: " + sname);
		System.out.println("Course Name: " + Student.course);
		System.out.println("University Name: " + Student.University);
		System.out.println("English Marks: " + this.eng);
		System.out.println("Maths Marks: " + this.math);
		System.out.println("Science Marks: " + this.science);
		System.out.println("Total: " + this.total);
	}
}

public class ClassAndObject {
	
	public static void main(String[] args) {
		Student student[] = new Student[5];
		for(int i = 0; i < 5; i++) {
			student[i] = new Student();
			student[i].takeData();
			student[i].showData();
		}
	}
	
}
