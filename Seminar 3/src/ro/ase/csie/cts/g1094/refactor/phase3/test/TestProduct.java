package ro.ase.csie.cts.g1094.refactor.phase3.test;

import ro.ase.csie.acs.g1094.refactor.phase3.ProductType;
import ro.ase.acs.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.acs.g1094.refactor.phase3.Product;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorService;

public class TestProduct {

	public static void main(String[] args) {
		
		Marketing2021Strategy mkService = new Marketing2021Strategy();
		ValidatorService validator = new ValidatorService();
		Product product = new Product(mkService, validator);
		
		try {
			float finalPrice = product.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
			// anonymous class example
			product.setMarketingService(new MarketingServiceInterface() {
				@Override
				public float getFidelityDiscount(int accountAge) {
					return 0.5f;
				}
			});
			finalPrice = product.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is " + finalPrice);
			
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
