package collectionList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector vector = new Vector<String>();

		vector.addElement("King");
		vector.addElement("Queen");
		vector.addElement("John");
		vector.addElement("Smith");

		System.out.println("Vector Elements: " + vector);
		System.out.println("The size of Vector: " + vector.size());
		System.out.println("The capacity of Vector: " + vector.capacity());

		Enumeration<String> enu = vector.elements();
		System.out.println("The Elements of the Vector: ");
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		System.out.println("-------------------------");

		Iterator<String> itr = vector.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
