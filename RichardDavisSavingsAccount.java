/**
 * This class models a basic savings account
 * Author: Richard Davis
 */
public class RichardDavisSavingsAccount
{
  private static double annualInterestRate; // annual interest rate for account
  private double savingsBalance; // represents the balance of account

  /**
   * This method instantiates a SavingsAccount object a default balance of 0
   *
   * @param  rate  the annual interest rate
   */
  public RichardDavisSavingsAccount(double rate)
  {
    annualInterestRate = rate;
    savingsBalance = 0;
  }

  /**
   * This method instantiates a SavingsAccount object
   *
   * @param  rate  the annual interest rate
   * @param  bal   the initial balance for the account
   */
  public RichardDavisSavingsAccount(double rate, double bal)
  {
    annualInterestRate = rate;
    savingsBalance = bal;
  }

  /**
   * This method modifies the annual interest rate
   *
   * @param  rate  the new annual interest rate
   */
  public static void modifyInterestRate(double rate)
  {
    annualInterestRate = rate;
  }

  /**
   * This method returns the balance for the account
   *
   * @return  savingsBalance  the balance for the account
   */
  public double getBalance()
  {
    return savingsBalance;
  }

  /**
   * This method returns the annual rate for the account
   *
   * @return  rate  the annual rate for the account
   */
  public double getRate()
  {
    return annualInterestRate;
  }

  /**
   * This method adds an amount to the savings balance
   *
   * @param  amt  amount to be deposited to the account
   */
  public void deposit(double amt)
  {
    savingsBalance += amt;
  }

  /**
   * This method subtracts an amount from the savings balance
   *
   * @param  amt  amount to be withdrawn from the account
   */
  public void withdraw(double amt)
  {
    if (savingsBalance - amt >= 100.0) {
      savingsBalance -= amt;
    } else {
      System.out.println("ERROR: Performing transaction would bring balance below $100 minimum!");
      System.out.println("Your account will be closed, and the balance \nwill be sent as a check to mailing address on file.");
    }
  }

  /**
   * This method calculates the monthly interest and increases account balance
   *
   */
  public void calculateMonthlyInterest()
  {
    double interest = this.getBalance() * annualInterestRate / 12;
    this.deposit(interest);
  }
}
