package practice;

public class AccessCourseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean email = true, facebook = false, google = true;
		
		if(email || facebook || google) {
			System.out.println("You can access the course");
		} else {
			System.out.println("You cannot access the course");
		}
	}

}
