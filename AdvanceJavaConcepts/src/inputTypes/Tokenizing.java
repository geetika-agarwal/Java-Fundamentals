package inputTypes;

import java.util.StringTokenizer;

// StringTokenizer class comes under java.util
// This class helps in breaking a string into tokens.

public class Tokenizing {
	public static void main(String[] args) {

		// Demonstration 1
//		StringTokenizer message = new StringTokenizer("Learning Java Fundamentals");
//
//		while (message.hasMoreTokens()) {
//			System.out.println(message.nextToken());
//		}

		// Demonstration 2
//		StringTokenizer message = new StringTokenizer("Learning.Java.Fundamentals");
//
//		while (message.hasMoreTokens()) {
//			System.out.println(message.nextToken(".")); // Using . as the delimiter.
//		}

		// Demonstration 3
		StringTokenizer message = new StringTokenizer("Learning,Java,Fundamentals", ",", true); // Also Tokenizes the
																								// delimiter
		System.out.println("Number of Tokens: " + message.countTokens());
		while (message.hasMoreTokens()) {
			System.out.println(message.nextToken());
		}
	}
}
