package conditions;

public class SimpleIf {
	public static void main(String[] args) {
		float sellingPrice = 12000;
		float costPrice = 10000;
		
		if(sellingPrice > costPrice)
			System.out.println("Profit");
		if (costPrice > sellingPrice)
			System.out.println("Loss");
	}
}
