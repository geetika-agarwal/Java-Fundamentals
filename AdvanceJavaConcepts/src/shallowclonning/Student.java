package shallowclonning;

public class Student implements Cloneable {
	int studentId;
	String studentName;
	Course course;

	public Student(int studentId, String studentName, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + "]";
	}

}
