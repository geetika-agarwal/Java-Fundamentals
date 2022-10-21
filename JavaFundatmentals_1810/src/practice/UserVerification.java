package practice;

public class UserVerification {
	public static void main(String[] args) {
		boolean isLoggedIn = true;
		boolean isEmailVerified = true;
		boolean isCardVerified = false;
		
		if(isLoggedIn && isEmailVerified && isCardVerified) {
			System.out.println("Continue Purchase");
		} else {
			System.out.println("Stop Purchase");
		}
	}
}
