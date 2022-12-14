package practice;
import java.util.*;

public class ProfitLossCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int costPrice = sc.nextInt();
		int sellingPrice = sc.nextInt();
		
		if(sellingPrice > costPrice)
			System.out.println("Profit");
		else if (costPrice > sellingPrice)
			System.out.println("Loss");
		else
			System.out.println("No Profit or Loss");
		
		// Ternary Operator
		String result = (sellingPrice >= costPrice) ? 
				((sellingPrice == costPrice) ?
					"No Profit or Loss" : 
					"Profit") :
				"Loss";
		System.out.println(result);
		
		sc.close();
	}
}
