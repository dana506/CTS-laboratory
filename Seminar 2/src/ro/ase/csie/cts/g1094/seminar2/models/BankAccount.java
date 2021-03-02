package ro.ase.csie.cts.g1094.seminar2.models;

public abstract class BankAccount extends Account{
	protected double balance;
	protected final String iban; 
	
	public BankAccount(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
	
	
}