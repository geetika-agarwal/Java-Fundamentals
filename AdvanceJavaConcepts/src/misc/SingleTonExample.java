package misc;

class SingleTon {
	// Static variable reference of same class
	private static SingleTon single_instance = null;

	// Declaring a String Variable
	public String str;

	// Private Constructor to restrict the class instantiation
	private SingleTon() {
		str = "Hello I'm a private Constructor";
	}

	// Method that returns single instance of the class
	public static SingleTon getInstance() {
		if (single_instance == null) {
			single_instance = new SingleTon();
		}
		return single_instance;
	}
}

public class SingleTonExample {
	public static void main(String[] args) {
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();

		if (obj1 == obj2 && obj2 == obj3) {
			System.out.println("All Objects are pointing to the same memory location");
			obj2.str = "Modified String";
			System.out.println(obj1.str);
		} else {
			System.out.println("Not in the same memory location");
		}
	}
}
