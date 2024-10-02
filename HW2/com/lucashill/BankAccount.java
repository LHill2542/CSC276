package com.lucashill;

public class BankAccount {
	private double INTEREST_RATE;
	private int accountNum;
	private double bankBalance, duration, interest;
	
	public void setBankBalance(double bankBalance) {this.bankBalance = bankBalance;}
	public double getBankBalance() {return bankBalance;}
	public void addBankBalance(double bankBalanceAdd) {bankBalance += bankBalanceAdd;}
	
	public BankAccount(int accountNum, double bankBalance, double duration, double INTEREST_RATE) {
		this.accountNum = accountNum;
		this.bankBalance = bankBalance;
		this.duration = duration;
		this.INTEREST_RATE = INTEREST_RATE;
	}
	
	private void calcInterest() {
		interest = bankBalance * INTEREST_RATE * duration;
	}
	
	public void updateBalance() {
		calcInterest();
		bankBalance += this.interest;
	}
	
	public void displayAccount() {
		System.out.println("---------- Account: " + accountNum + " ----------");
		System.out.println("Bank Balance: " + bankBalance);
		System.out.println("Interest Rate: " + INTEREST_RATE);
		System.out.println("----------------------------------\n");
	}
	
	
	public static double convertCur(double fAmount, double fEx) {
		return fAmount * fEx;
	}
}
