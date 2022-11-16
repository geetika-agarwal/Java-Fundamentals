package interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> checkCriteria = (age, marks) -> {
			if (age >= 18 && marks >= 75)
				System.out.println("Congrats!! You are shortlisted...");
			else
				System.out.println("Better Luck next time...");
		};

		checkCriteria.accept(22, 87);
	}
}
