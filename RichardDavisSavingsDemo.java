/**
 * This class tests the RichardDavisSavingsAccount class
 * Author: Richard Davis
 */
public class RichardDavisSavingsDemo
{
  public static void main(String args[])
  {
    // initializes first two test accounts
    System.out.println("Initializing two test accounts...");
    RichardDavisSavingsAccount acct1 = new RichardDavisSavingsAccount(.05, 5000.0);
    System.out.printf("First account: Balance = $%8.2f, Annual Rate = %3.2f\n", acct1.getBalance(), acct1.getRate());
    RichardDavisSavingsAccount acct2 = new RichardDavisSavingsAccount(.05, 2500.0);
    System.out.printf("Second account: Balance = $%8.2f, Annual Rate = %3.2f\n\n", acct2.getBalance(), acct2.getRate());

    // calculates the monthly interest for both test accounts
    System.out.println("Calculating first month's interest...");
    acct1.calculateMonthlyInterest();
    acct2.calculateMonthlyInterest();

    // displays results
    System.out.printf("First account: Balance = $%8.2f, Annual Rate = %3.2f\n", acct1.getBalance(), acct1.getRate());
    System.out.printf("Second account: Balance = $%8.2f, Annual Rate = %3.2f\n\n", acct2.getBalance(), acct2.getRate());

    // modifies the annual interest rate
    System.out.println("Modifying the interest rate...");
    RichardDavisSavingsAccount.modifyInterestRate(.07);

    // calculates the monthly interest for both test accounts
    System.out.println("Calculating the second month's interest...");
    acct1.calculateMonthlyInterest();
    acct2.calculateMonthlyInterest();

    // displays results
    System.out.printf("First account: Balance = $%8.2f, Annual Rate = %3.2f\n", acct1.getBalance(), acct1.getRate());
    System.out.printf("Second account: Balance = $%8.2f, Annual Rate = %3.2f\n\n", acct2.getBalance(), acct2.getRate());

    // withdraw an amount from an account
    System.out.println("Withdrawing $2500 from account 1...");
    acct1.withdraw(2500.0);
    System.out.printf("First account: Balance = $%8.2f\n\n", acct1.getBalance());

    // attempts to withdraw account 2 below 100 dollar minimum
    System.out.println("Attempting to withdraw account 2 below $100 minimum...");
    acct2.withdraw(2500.0);

    // exits program
    System.out.println("\nExiting demo program...");
    System.exit(0);
  }
}
