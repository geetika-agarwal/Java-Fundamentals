package inheritance;

import java.util.Scanner;

// This code is used to show the working of inheritance
// where the public and protected data members ad methods
// of the super/ parent class can be accessed by the 
// sub/ child class.

class Student {
	private int id;
	private String name;
	private String course;
	private static String schoolName;

	static {
		schoolName = "SPHN";
	}

	Scanner sc = new Scanner(System.in);

	public void acceptDetails() {
		System.out.println("Enter student id: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		this.name = sc.nextLine();
		System.out.println("Enter the course");
		this.course = sc.nextLine();
	}

	public void displayDetails() {
		System.out.println("Student information:");
		System.out.println("Student ID: " + this.id);
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Course: " + this.course);
		System.out.println("Student University: " + Student.schoolName);
	}
}

class Marks extends Student {
	float objectiveMarks;
	float subjectiveMarks;

	public void acceptMarks() {
		System.out.println("Enter Objective Marks: ");
		this.objectiveMarks = sc.nextFloat();
		System.out.println("Enter the Subjective Marks: ");
		this.subjectiveMarks = sc.nextFloat();
	}

	public void displayDetails1() {
		System.out.println("Student Marks: ");
		System.out.println("The Objective Marks are: " + this.objectiveMarks);
		System.out.println("The Subjective Marks are: " + this.subjectiveMarks);
	}

}

public class MainEntry {

	public static void main(String[] args) {

		Marks obj = new Marks();
		obj.acceptDetails();
		obj.acceptMarks();
		obj.displayDetails();
		System.out.println("---------------------------");
		obj.displayDetails1();

	}

}
