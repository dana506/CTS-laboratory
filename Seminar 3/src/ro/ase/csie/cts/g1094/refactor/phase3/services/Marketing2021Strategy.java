package ro.ase.csie.cts.g1094.refactor.phase3.services;

public class Marketing2021Strategy implements MarketingServiceInterface {
    @Override
    public float getFidelityDiscount(int yearsSinceRegistration) {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }
}