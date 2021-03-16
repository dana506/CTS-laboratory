package ro.ase.csie.cts.g1094.refactor.phase3.services;

import ro.ase.acs.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.g1094.refactor.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorServiceInterface {

	@Override
	public void validatePrice(float initialPrice) throws InvalidPriceException {
		if(initialPrice <= 0) {
			throw new InvalidPriceException();
		}
	}

	@Override
	public void validateYearsSinceRegistration(int accountAge) throws InvalidAgeException {
		if(accountAge < 0) {
			throw new InvalidAgeException();
		}
	}

}