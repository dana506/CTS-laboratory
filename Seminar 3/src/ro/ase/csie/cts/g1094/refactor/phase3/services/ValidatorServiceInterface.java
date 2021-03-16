package ro.ase.csie.cts.g1094.refactor.phase3.services;

import ro.ase.acs.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.g1094.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
		
		public abstract void validatePrice(float initialPrice) 
				throws InvalidPriceException;
		public abstract void validateYearsSinceRegistration(int accountAge) 
				throws InvalidAgeException;
	}