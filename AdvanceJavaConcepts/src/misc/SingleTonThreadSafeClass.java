package misc;

class SingleTonClass {
	// Static variable reference of same class
	private static SingleTonClass single_instance = null;

	// Declaring a String Variable
	public String str;

	// Private Constructor to restrict the class instantiation
	private SingleTonClass() {
		str = "Hello I'm a private Constructor";
	}

	// Method that returns single instance of the class and made thread-safe by
	// adding synchronized keyword
	public static synchronized SingleTonClass getInstance() {
		if (single_instance == null) {
			single_instance = new SingleTonClass();
		}
		return single_instance;
	}
}

public class SingleTonThreadSafeClass {
	public static void main(String[] args) {
		SingleTonClass obj1 = SingleTonClass.getInstance();
		SingleTonClass obj2 = SingleTonClass.getInstance();
		SingleTonClass obj3 = SingleTonClass.getInstance();

		if (obj1 == obj2 && obj2 == obj3) {
			System.out.println("All Objects are pointing to the same memory location");
			obj2.str = "Modified String";
			System.out.println(obj1.str);
		} else {
			System.out.println("Not in the same memory location");
		}
	}
}
