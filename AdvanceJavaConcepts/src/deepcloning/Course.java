package deepcloning;

public class Course implements Cloneable {
	String subject1;
	String subject2;
	String subject3;

	public Course(String subject1, String subject2, String subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
