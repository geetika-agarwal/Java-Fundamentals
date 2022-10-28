package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) throws IOException {
		Student std = new Student(100, "Geetika Agarwal");

		FileOutputStream outstream = new FileOutputStream(
				"C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\studentData.txt");
		ObjectOutputStream out = new ObjectOutputStream(outstream);

		out.writeObject(std);

		out.flush();

		out.close();
		outstream.close();

		System.out.println("Student Details Serialized Successfully");
	}
}
