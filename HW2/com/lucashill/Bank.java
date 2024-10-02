package com.lucashill;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(100, 1000, 2, 0.03);
		BankAccount b2 = new BankAccount(200, 1500, 2, 0.03);
		
		//instead of implementing a method addBankBalance() the same problem could have been solved with the following-
		// b1.setBankBalance(b1.getBankBalance() + 300);
		// b2.setBankBalance(b2.getBankBalance() - 400);
		b1.addBankBalance(300);
		b2.addBankBalance(-400);
		
		
		b1.displayAccount();
		b2.displayAccount();
		
		b1.setBankBalance(BankAccount.convertCur(150, 1.18));
		b2.setBankBalance(BankAccount.convertCur(140, 1.10));
		System.out.println("After Currency Change: \n");
		b1.displayAccount();
		b2.displayAccount();
		
		//The homework instructed to make the methods calcInterest() and updateBalance() but neither were used. I don't know if I missed a step or if they're redundant
	}

}
