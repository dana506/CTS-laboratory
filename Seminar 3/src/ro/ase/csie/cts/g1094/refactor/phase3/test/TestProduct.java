package ro.ase.csie.cts.g1094.refactor.phase3.test;

import ro.ase.csie.acs.g1094.refactor.phase2.Product;

public class TestProduct {

	public static void main(String[] args) {
		
		Product product = new Product(null);
		try { 
			float finalPrice =
					product.ComputePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is"	+ finalPrice);	
	}

}
