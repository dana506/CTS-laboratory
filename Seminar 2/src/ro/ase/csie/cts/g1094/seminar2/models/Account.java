package ro.ase.csie.cts.g1094.seminar2.models;

import ro.ase.csie.cts.g1094.seminar2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1094.seminar2.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException;
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}