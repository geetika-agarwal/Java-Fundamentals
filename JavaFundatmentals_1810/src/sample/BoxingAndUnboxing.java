package sample;

public class BoxingAndUnboxing {

	public static void main(String[] args) {

		// Primitive type
		int num = 100;

		// Converting primitive type to object
		Integer number = Integer.valueOf(num);

		System.out.println(num);
		System.out.println(number);
		System.out.println(number.getClass().getSimpleName());

		System.out.println("---------------------------");
		// Auto Boxing (automatically converts the primitive type into object once it
		// has been converted to object
		Integer anotherNumber = num;

		System.out.println(num);
		System.out.println(anotherNumber);
		System.out.println(anotherNumber.getClass().getSimpleName());

		System.out.println("---------------------------");
		// Converting object to primitive type
		int unboxValue = number.intValue();

		System.out.println(unboxValue);
	}

}
