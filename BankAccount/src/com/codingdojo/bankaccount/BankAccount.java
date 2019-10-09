package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double savings;
	private double checking;
	private static int numOfAccounts=0;
	private static double total=0.0;
	
	public BankAccount() {
		this.accountNumber= this.generateAccountNumber();
		numOfAccounts++;
	}
	
	private String generateAccountNumber() {
		String acc="";
		Random r =new Random();
		
		for(int i=0;i<10;i++) {
			acc += String.valueOf(r.nextInt(9));
		}
		 
		return acc;
		}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getSavings() {
		return savings;
	}


	public double getChecking() {
		return checking;
	}

	public static int getNumOfAccounts() {
		return numOfAccounts;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		BankAccount.total = total;
	}
	
	public double deposit(String accountType,double amount) {
		if(accountType.equals("checking")) {
			this.checking += amount;
			total += amount;
			return this.checking;
		}else {
			this.savings += amount;
			total += amount;
			return this.savings;
		}
	}
	
	public double withdraw (String accountType,double amount) {
	if(accountType.equals("checking")) {
		if( amount<= this.checking) {
		this.checking -= amount;
		total -= amount;
		return this.checking;

		}else {
			return this.checking;
		}
	}else {
		if( amount<= this.savings) {
		this.savings -= amount;
		total -= amount;
		return this.savings;

		}else {
			return this.savings;
		}
		
	}
}
	
}
