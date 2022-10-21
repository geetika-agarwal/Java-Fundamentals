package classes;

class Student {
	int studentId;
	String studentName;
	int studentAge;
	
	// Default Constructor
	public Student() {
		this.studentId = 1000;
		this.studentName = "Geetika";
		this.studentAge = 22;
	}
	
	// Parameterized Constructor
	public Student(int sid, String sname, int sage) {
		this.studentId = sid;
		this.studentName = sname;
		this.studentAge = sage;
	}
	
	// Copy Constructor
	public Student(Student stdObj) {
		this.studentId = stdObj.studentId;
		this.studentName = stdObj.studentName;
		this.studentAge = stdObj.studentAge;
	}
	
	public void displayDetails() {
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Student Age: " + this.studentAge);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.displayDetails();
		
		Student student2 = new Student(1001, "King", 24);
		student2.displayDetails();
		
		Student student3 = new Student(student2);
		student3.displayDetails();
	}
}
