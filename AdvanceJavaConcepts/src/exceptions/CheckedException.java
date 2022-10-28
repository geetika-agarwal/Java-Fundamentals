package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		FileReader fr;
		fr = new FileReader("C:\\Users\\geeti\\eclipse-wiley-workshop\\ExceptionHandling.txt");
		fr.close();
	}

}
