package ro.ase.csie.acs.g1094.refactor.phase2;

import ro.ase.acs.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.g1094.refactor.exceptions.InvalidPriceException;

public class Product {

	public static final int MAX_AGE_ACCOUNT = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

	public static float getDiscountValue(float price, float discount) {

		return discount * price;
	}

	private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount) {

		return (price - discountValue) * (1 - fidelityDiscount);
	}

	private static float getFidelityDiscount(int accountAge) {
		return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float) accountAge / 100;
	}

	private static float getFinalPrice(float price, float fidelityDiscount, ProductType type) {
		float discountValue = getDiscountValue(price, type.getDiscount());
		float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
		return finalPrice;
	}

	public float ComputePriceWithDiscount(ProductType productType, float price, int accountAge)
			throws InvalidPriceException, InvalidAgeException {
		if (price <= 0) {
			throw new InvalidPriceException();
		}

		if (accountAge < 0) {
			throw new InvalidAgeException();
		}

		float fidelityDiscount = (productType == ProductType.NEW) ? 0 : getFidelityDiscount(accountAge);

		float finalPrice = getFinalPrice(price, fidelityDiscount, productType);

		return finalPrice;
		
		/*
		 * switch (productType) { case NEW:
		 * 
		 * finalPrice = getFinalPrice(price, fidelityDiscount, ProductType.NEW); break;
		 * case DISCOUNTED: finalPrice = getFinalPrice(price, fidelityDiscount,
		 * ProductType.DISCOUNTED); case LIMITED_STOCK: finalPrice =
		 * getFinalPrice(price, fidelityDiscount, ProductType.LIMITED_STOCK); break;
		 * case LEGACY: finalPrice = getFinalPrice(price, fidelityDiscount,
		 * ProductType.LEGACY); break; default: throw new
		 * UnsupportedOperationException("The enum type is not covered"); }
		 * 
		 * return finalPrice;
		 */
	}
}