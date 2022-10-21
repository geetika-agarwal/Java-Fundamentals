package conditions;

public class NestedIfElse {
	public static void main(String[] args) {
		float sellingPrice = 12000;
		float costPrice = 10000;
		
		if(sellingPrice >= costPrice) {
			if(sellingPrice > costPrice) {
				System.out.println("Profit");
			} else {
				System.out.println("No Profit No L0ss");
			}
		} else 
			System.out.println("Loss");
	}
}
