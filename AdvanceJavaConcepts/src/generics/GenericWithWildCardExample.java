package generics;

import java.util.ArrayList;
import java.util.List;

abstract class IShape {
	abstract void drawShape();
}

class Square extends IShape {
	@Override
	public void drawShape() {
		System.out.println("Drawing Square Here....");
	}
}

class Rectangle extends IShape {
	@Override
	public void drawShape() {
		System.out.println("Drawing a Rectangle Here....");
	}
}

public class GenericWithWildCardExample {

	public static void drawing(List<? extends IShape> list) {
		for (IShape shape : list) {
			shape.drawShape();
		}
	}

	public static void main(String[] args) {
		List<Square> list1 = new ArrayList<Square>();
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());

		List<Rectangle> list2 = new ArrayList<Rectangle>();
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());

		drawing(list1);
		System.out.println("-------------------");
		drawing(list2);
	}
}
