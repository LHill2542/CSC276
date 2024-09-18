package com.lucashill;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Checking account
		
		System.out.println("Input the following values for the Checking account.");
		System.out.print("Input initial balance: ");
		double balanceChecking = sc.nextDouble();
		
		System.out.print("Input interest rate (as a decimal): ");
		double iRateChecking = sc.nextDouble();
		
		System.out.print("Input duration in years: ");
		double durationChecking = sc.nextDouble(); //Double allows for fractions of years, Ex; 1.5 years
		
		double simpleInterestChecking = balanceChecking * iRateChecking * durationChecking;
		double finalBalanceChecking = balanceChecking + simpleInterestChecking;
		System.out.printf("The final balance is $%.2f%n%n", finalBalanceChecking);
		
		
		//Savings account
		
		System.out.println("Input the following values for the Savings account.");
		System.out.print("Input initial balance: ");
		double balanceSavings = sc.nextDouble();
		
		System.out.print("Input interest rate: ");
		double iRateSavings = sc.nextDouble();
		
		System.out.print("Input duration in years: ");
		double durationSavings = sc.nextDouble(); //Double allows for fractions of years, Ex; 1.5 years
		
		double simpleInterestSavings = balanceSavings * iRateSavings * durationSavings;
		double finalBalanceSavings = balanceSavings + simpleInterestSavings;
		System.out.printf("The final balance is $%.2f%n%n", finalBalanceSavings);
		
		//Bank Statement
		
		System.out.println("------ JPMorgan Chase Bank Statement ------");
		System.out.printf("Checking Account Balance: $%.2f%n", finalBalanceChecking);
		System.out.printf("Checking Account Interest Earned: $%.2f%n", simpleInterestChecking);
		System.out.printf("Savings Account Balance: $%.2f%n", finalBalanceSavings);
		System.out.printf("Savings Account Interest Earned: $%.2f%n", simpleInterestSavings);
		System.out.print("-------------------------------------------");
	}

}
