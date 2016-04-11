
/**
 * This class models a yearly company profit object
 *
 */
public class RichardDavisProfit
{
  private static final int MONTHS = 12;
  private double[] monthsProfit;

  /**
   * This method instantiates the profit object
   *
   */
  public RichardDavisProfit()
  {
    monthsProfit = new double[MONTHS];
  }

  /**
   * This method returns the profit for the year
   *
   * @return  monthsProfit  the profit for each month
   */
  public double[] getMonthsProfit()
  {
    return monthsProfit;
  }

  /**
   * This method sets the profit for the year
   *
   * @param  mProfit  the profit for each month
   */
  public void setMonthsProfit(double[] mProfit)
  {
    monthsProfit = mProfit;
  }

  /**
   * This method returns the profit for the year
   *
   * @return  yearlyProfit  the total profit for the year
   */
  public double calculateTotalProfit()
  {
    double yearlyProfit = 0;
    double[] mProfit = getMonthsProfit();

    for (int i = 0; i < MONTHS; i++) {
      yearlyProfit += mProfit[i];
    }

    return yearlyProfit;
  }

  /**
   * This method returns the average monthly profit
   *
   * @return  averageProfit  the average monthly profit
   */
  public double calculateAverageProfit()
  {
    double averageProfit = 0;
    double totalProfit = 0;
    double[] mProfit = getMonthsProfit();

    for (int i = 0; i < MONTHS; i++) {
      totalProfit += mProfit[i];
    }

    averageProfit = (double)(totalProfit / MONTHS);
    return averageProfit;
  }

  /**
   * This method returns the month with the highest profit
   *
   * @return  highestMonth  the month with the highest profit
   */
  public int monthHighestProfit()
  {
    double[] mProfit = getMonthsProfit();
    double highestProfit = mProfit[0];
    int highestMonth = 1;

    for (int i = 0; i < MONTHS; i++) {
      if (highestProfit < mProfit[i]) {
        highestProfit = mProfit[i];
        highestMonth = i+1;
      }
    }

    return highestMonth;
  }

  /**
   * This method returns the month with the lowest profit
   *
   * @return  lowestMonth  the month with the lowest profit
   */
  public int monthLowestProfit()
  {
    double[] mProfit = getMonthsProfit();
    double lowestProfit = mProfit[0];
    int lowestMonth = 1;

    for (int i = 0; i < MONTHS; i++) {
      if (lowestProfit > mProfit[i]) {
        lowestProfit = mProfit[i];
        lowestMonth = i+1;
      }
    }
    return lowestMonth;
  }
}
