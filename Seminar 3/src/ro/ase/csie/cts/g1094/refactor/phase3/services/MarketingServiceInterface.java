package ro.ase.csie.cts.g1094.refactor.phase3.services;

public interface MarketingServiceInterface {

    int FIDELITY_YEARS_THRESHOLD = 10;
    float MAX_FIDELITY_DISCOUNT = 0.15f;

   float getFidelityDiscount(int accountAge);
   
}