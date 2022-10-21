package getterAndSetter;

class StudentData {
	private String name;
	private String course;
	private int age;
	private static String schoolName;

	static {
		StudentData.schoolName = "SPHN";
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setAge(int age) {
		if (age >= 18)
			this.age = age;
		else
			System.out.println("You can't get Enrollment in this course");
	}

	// Getter Methods
	public String getName() {
		return this.name;
	}

	public String getCourse() {
		return this.course;
	}

	public int getAge() {
		return this.age;
	}

	public String getSchoolName() {
		return StudentData.schoolName;
	}
}

public class GetterAndSetter {

	public static void main(String[] args) {
		StudentData std = new StudentData();
		std.setName("Geetika");
		std.setCourse("Computer Science");
		std.setAge(22);

		System.out.println("Name: " + std.getName());
		System.out.println("Course: " + std.getCourse());
		System.out.println("Age: " + std.getAge());
		System.out.println("School Name: " + std.getSchoolName());
	}
}
