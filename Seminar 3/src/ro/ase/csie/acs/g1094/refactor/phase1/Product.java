package ro.ase.csie.acs.g1094.refactor.phase1;

import ro.ase.acs.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.g1094.refactor.exceptions.InvalidPriceException;


public class Product {

	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

	public float ComputePriceWithDiscount(ProductType productType, float price, int accountAge) {
		float finalPrice = 0;
		float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float) accountAge / 100;

		switch (productType) {
		case NEW:
			finalPrice = price;
			break;
		case DISCOUNTED:
			finalPrice = (price - (ProductType.DISCOUNTED.getDiscount() * price))
					- fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscount() * price));
			break;
		case LIMITED_STOCK:
			finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscount() * price))
					- fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscount() * price));
			break;
		case OLD:
			finalPrice = (price - (ProductType.OLD.getDiscount() * price))
					- fidelityDiscount * (price - (ProductType.OLD.getDiscount() * price));
			break;
		default:
			throw new UnsupportedOperationException("The enum type is not covered");
		}

		return finalPrice;
	}
}
