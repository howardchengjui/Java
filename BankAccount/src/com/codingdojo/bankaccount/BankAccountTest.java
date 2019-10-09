package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String [] args) {
		BankAccount b1= new BankAccount();
		BankAccount b2= new BankAccount();

		
		System.out.println(b1.getAccountNumber());
		System.out.println(b2.getAccountNumber());
		
		b1.deposit("checking",500.0);
		b1.deposit("savings", 20.0);
		
		System.out.println(b1.getChecking());
		System.out.println(b1.getSavings());
		System.out.println(BankAccount.getNumOfAccounts());
	}
}
