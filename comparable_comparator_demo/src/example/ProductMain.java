package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(999, "TV", 23.33, 3.0f));
		productList.add(new Product(102, "TV", 13.33, 4.3f));
		productList.add(new Product(211, "TV", 23.33, 3.3f));
		productList.add(new Product(455, "TV", 23.33, 4.3f));
		productList.add(new Product(210, "TV", 43.34, 3.3f));
		productList.add(new Product(111, "TV", 13.63, 4.3f));

		System.out.println("Printing all the products");
		printProducts(productList);

		Collections.sort(productList);
		System.out.println("\n\nPrinting all the products sorted based on id");
		printProducts(productList);

		Collections.sort(productList, new ProductCostComparator());
		System.out.println("\n\nPrinting all the products sorted based on cost ascending using external class");
		printProducts(productList);

		Collections.sort(productList, (Product p1, Product p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d2.compareTo(d1);
		});
		System.out.println("\n\nPrinting all the products sorted based on cost descending using lambda");
		printProducts(productList);

		Collections.sort(productList, (Product p1, Product p2) -> {
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();

			int x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}

			return x;
		});
		System.out.println(
				"\n\nPrinting all the products sorted based on ratings  descending using lambda if 2 or more ratings same then ascending with product using lambda");
		printProducts(productList);

	}

	public static void printProducts(List<Product> productList) {
		for (Product p : productList) {
			System.out.println(p);
		}
	}

}
