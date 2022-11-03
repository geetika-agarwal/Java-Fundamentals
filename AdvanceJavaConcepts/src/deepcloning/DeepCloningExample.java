package deepcloning;

public class DeepCloningExample implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1 = new Course("Java", "SQL", "C++");

		Student student1 = new Student(10, "Smith", course1);
		Student student2 = null;

		student2 = (Student) student1.clone();

		System.out.println(student1);
		System.out.println(student2);

		student1.course.subject1 = "Core Java";

		System.out.println(student1.course.subject1);
		System.out.println(student2.course.subject1);

		student2.course.subject2 = "Advance DSA";

		System.out.println(student1.course.subject2);
		System.out.println(student2.course.subject2);
	}
}
