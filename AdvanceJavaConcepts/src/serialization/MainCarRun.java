package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainCarRun {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("car.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Car car = new Car("abc123", 123, "maruti", 50297.98);

		oos.writeObject(car);
		System.out.println("Object Serialized!!");

		oos.close();
		fos.close();

		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fin);

		Car carObj = (Car) ois.readObject();
		System.out.println("Registration Number: " + carObj.getRegno());
		System.out.println("Model of Car: " + carObj.getModel());
		System.out.println(carObj);

	}
}
