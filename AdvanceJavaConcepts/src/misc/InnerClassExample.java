package misc;

class Brand {
	static String brandName;

	class Product {
		String productName;
		float productPrice;

		public float getProductPrice() {
			return 2000;
		}

		public void displayBrand() {
			System.out.println(brandName);
		}
	}

	protected class AnotherProduct {
		String productDesc;
		int productQuantity;

		public int getProductQuantity() {
			return 10;
		}
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		Brand brand = new Brand();
		Brand.Product product = brand.new Product();
		System.out.println(product.getProductPrice());

		Brand.AnotherProduct anotherProduct = brand.new AnotherProduct();
		System.out.println(anotherProduct.getProductQuantity());
	}
}
