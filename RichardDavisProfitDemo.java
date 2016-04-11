import java.util.Scanner;

/**
 * This class tests the RichardDavisProfit class
 *
 */
public class RichardDavisProfitDemo
{
  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    // greets user
    System.out.println("Richard Davis's Space Company");

    // creates scanner object
    Scanner in = new Scanner(System.in);

    // creates array of doubles representing months of profit
    // and loads user provided values to array
    double[] monthsProfit = new double[12];
    for (int i = 0; i < 12; i++) {
      do {
        System.out.print("Enter the profit for month " + (i+1) + " ->");
        monthsProfit[i] = in.nextDouble();
        if (monthsProfit[i] < 0) {
          System.out.println("ERROR: profit cannot be negative. Reenter.");
        }
      } while (monthsProfit[i] < 0);
    }

    // instantiates a RichardDavisProfit object and passes monthly profit
    RichardDavisProfit yearProfit = new RichardDavisProfit();
    yearProfit.setMonthsProfit(monthsProfit);

    // displays results of method calls
    System.out.printf("The total profit for the year: $%8.2f\n", yearProfit.calculateTotalProfit());
    System.out.printf("The average monthly profit:    $%8.2f\n", yearProfit.calculateAverageProfit());
    System.out.printf("Month with highest profit:      Month %2d\n", yearProfit.monthHighestProfit());
    System.out.printf("Month with lowest profit:       Month %2d\n", yearProfit.monthLowestProfit());
  }

}
