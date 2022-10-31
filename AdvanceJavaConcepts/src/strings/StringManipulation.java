package strings;

class StringManip {
	public static void stringConcat(String str1) {
		str1 += "Fundamentals";
	}

	public static void stringBufferConcat(StringBuffer str1) {
		str1.append("Fundamentals");
	}

	public static void stringBuilderConcat(StringBuilder str1) {
		str1.append("Fundamentals");
	}
}

public class StringManipulation {
	public static void main(String[] args) {
		String str1 = "Java";
		StringManip.stringConcat(str1);
		System.out.println(str1);

		StringBuffer str2 = new StringBuffer("Java ");
		StringManip.stringBufferConcat(str2);
		System.out.println(str2);

		StringBuilder str3 = new StringBuilder("Java Core ");
		StringManip.stringBuilderConcat(str3);
		System.out.println(str3);
	}
}
