package sample;

enum Planet {
	MERCURY, VENUS, EARTH, MARS, JUPYTER, SATURN, URANUS, NEPTUNE
}

public class EnumerationExample {
	public static void main(String[] args) {
		Planet p = Planet.EARTH;
		System.out.println(p);
		for (Planet p1 : Planet.values()) {
			System.out.println(p1.name());
		}
	}
}
