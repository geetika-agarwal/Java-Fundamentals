package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream inStream = new FileInputStream(
				"C:\\Users\\geeti\\eclipse-wiley-workshop\\Files\\studentData.txt");
		ObjectInputStream in = new ObjectInputStream(inStream);

		Student std = (Student) in.readObject();
		System.out.println(std);

		in.close();
		inStream.close();
	}
}
