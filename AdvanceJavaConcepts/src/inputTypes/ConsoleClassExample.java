package inputTypes;

public class ConsoleClassExample {
	public static void main(String[] args) throws NullPointerException {
		System.out.println("Enter User Name");
		String username = System.console().readLine();
		System.out.println("Enter Password");
		char[] password = System.console().readPassword();

		System.out.println("Username: " + username);
		System.out.print("Password: ");
		for (char c : password) {
			System.out.print(c);
		}
	}
}
