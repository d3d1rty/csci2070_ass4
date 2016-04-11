import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * This class creates a basic calculator
 * Author: Richard Davis
 */
public class RichardDavisCalculator extends JFrame
{
  double numOne;
  double numTwo;
  // swing components
  private JPanel panel;
  private CalcButtonPanel buttonPanel;
  private JTextField numberTextField;
  private final int WINDOW_WIDTH = 300;
  private final int WINDOW_HEIGHT = 300;

  /**
   * This method instantiates a SavingsAccount object a default balance of 0
   *
   */
  public RichardDavisCalculator()
  {
    // set window title
    setTitle("Richard Davis's Basic Calculator");
    // set window size
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    // set close button to exit program
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // sets layout
    setLayout(new BorderLayout());
    // prepares panel
    buildPanel();
    // add panel to content frame
    add(panel, BorderLayout.NORTH);
    // instantiates button panel
    buttonPanel = new CalcButtonPanel();
    // add button panel to content frame
    add(buttonPanel, BorderLayout.CENTER);
    // display the window
    setVisible(true);
  }

  /**
   * This method adds text field to panel
   *
   */
  private void buildPanel()
  {
    panel = new JPanel();
    numberTextField = new JTextField(20);
    panel.add(numberTextField);
  }

  /**
   * This class instantiates a button panel
   *
   */
  public class CalcButtonPanel extends JPanel
  {
    private double numOne;
    private double numTwo;
    private double result;
    private String strBuffer = "";
    private boolean divide = false;
    private boolean multiply = false;
    private boolean subtract = false;
    private boolean add = false;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton decButton;
    private JButton equButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    /**
     * This method adds label, text field, and button to panel
     *
     */
    private CalcButtonPanel()
    {
      // sets grid layout
      setLayout(new GridLayout(4, 4));

      // instantiates and registers buttons
      oneButton = new JButton("1");
      oneButton.addActionListener(new OneButtonListener());
      twoButton = new JButton("2");
      twoButton.addActionListener(new TwoButtonListener());
      threeButton = new JButton("3");
      threeButton.addActionListener(new ThreeButtonListener());
      fourButton = new JButton("4");
      fourButton.addActionListener(new FourButtonListener());
      fiveButton = new JButton("5");
      fiveButton.addActionListener(new FiveButtonListener());
      sixButton = new JButton("6");
      sixButton.addActionListener(new SixButtonListener());
      sevenButton = new JButton("7");
      sevenButton.addActionListener(new SevenButtonListener());
      eightButton = new JButton("8");
      eightButton.addActionListener(new EightButtonListener());
      nineButton = new JButton("9");
      nineButton.addActionListener(new NineButtonListener());
      zeroButton = new JButton("0");
      zeroButton.addActionListener(new ZeroButtonListener());
      decButton = new JButton(".");
      decButton.addActionListener(new DecButtonListener());
      equButton = new JButton("=");
      equButton.addActionListener(new EquButtonListener());
      divideButton = new JButton("/");
      divideButton.addActionListener(new DivideButtonListener());
      multiplyButton = new JButton("*");
      multiplyButton.addActionListener(new MultiplyButtonListener());
      subtractButton = new JButton("-");
      subtractButton.addActionListener(new SubtractButtonListener());
      addButton = new JButton("+");
      addButton.addActionListener(new AddButtonListener());

      // adds border
      setBorder(BorderFactory.createTitledBorder("Standard"));

      // places buttons on panel
      add(sevenButton);
      add(eightButton);
      add(nineButton);
      add(divideButton);
      add(fourButton);
      add(fiveButton);
      add(sixButton);
      add(multiplyButton);
      add(oneButton);
      add(twoButton);
      add(threeButton);
      add(subtractButton);
      add(zeroButton);
      add(decButton);
      add(equButton);
      add(addButton);
    }

    /**
     * This class is an action listener for one button
     *
     */
    private class OneButtonListener implements ActionListener
    {
      /**
       * This method executes when the one button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "1";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for two button
     *
     */
    private class TwoButtonListener implements ActionListener
    {
      /**
       * This method executes when the two button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "2";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for three button
     *
     */
    private class ThreeButtonListener implements ActionListener
    {
      /**
       * This method executes when the three button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "3";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for four button
     *
     */
    private class FourButtonListener implements ActionListener
    {
      /**
       * This method executes when the four button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "4";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for five button
     *
     */
    private class FiveButtonListener implements ActionListener
    {
      /**
       * This method executes when the five button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "5";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for six button
     *
     */
    private class SixButtonListener implements ActionListener
    {
      /**
       * This method executes when the six button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "6";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for seven button
     *
     */
    private class SevenButtonListener implements ActionListener
    {
      /**
       * This method executes when the seven button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "7";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for eight button
     *
     */
    private class EightButtonListener implements ActionListener
    {
      /**
       * This method executes when the eight button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "8";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for nine button
     *
     */
    private class NineButtonListener implements ActionListener
    {
      /**
       * This method executes when the nine button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "9";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for zero button
     *
     */
    private class ZeroButtonListener implements ActionListener
    {
      /**
       * This method executes when the zero button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + "0";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for decimal button
     *
     */
    private class DecButtonListener implements ActionListener
    {
      /**
       * This method executes when the decimal button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        strBuffer = strBuffer + ".";
        numberTextField.setText(strBuffer);
      }
    }

    /**
     * This class is an action listener for equals button
     *
     */
    private class EquButtonListener implements ActionListener
    {
      /**
       * This method executes when the equals button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        numTwo = Double.parseDouble(strBuffer);
        if (divide) {
          if (numOne == 0 || numTwo == 0) {
            numberTextField.setText("ERROR: Cannot divide by 0!");
          } else {
            result = numOne / numTwo;
            numberTextField.setText(numOne + " / " + numTwo + " = " + result);
          }
        } else if (multiply) {
          result = numOne * numTwo;
          numberTextField.setText(numOne + " * " + numTwo + " = " + result);
        } else if (subtract) {
          result = numOne - numTwo;
          numberTextField.setText(numOne + " - " + numTwo + " = " + result);
        } else if (add) {
          result = numOne + numTwo;
          numberTextField.setText(numOne + " + " + numTwo + " = " + result);
        }
        strBuffer = "";
      }
    }

    /**
     * This class is an action listener for divide button
     *
     */
    private class DivideButtonListener implements ActionListener
    {
      /**
       * This method executes when the divide button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        numOne = Double.parseDouble(strBuffer);
        strBuffer = "";
        divide = true;
        multiply = false;
        subtract = false;
        add = false;
      }
    }

    /**
     * This class is an action listener for multiply button
     *
     */
    private class MultiplyButtonListener implements ActionListener
    {
      /**
       * This method executes when the multiply button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        numOne = Double.parseDouble(strBuffer);
        strBuffer = "";
        multiply = true;
        divide = false;
        subtract = false;
        add = false;
      }
    }

    /**
     * This class is an action listener for subtract button
     *
     */
    private class SubtractButtonListener implements ActionListener
    {
      /**
       * This method executes when the subtract button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        numOne = Double.parseDouble(strBuffer);
        strBuffer = "";
        subtract = true;
        divide = false;
        multiply = false;
        add = false;
      }
    }

    /**
     * This class is an action listener for add button
     *
     */
    private class AddButtonListener implements ActionListener
    {
      /**
       * This method executes when the add button is clicked
       *
       */
      public void actionPerformed(ActionEvent e)
      {
        numOne = Double.parseDouble(strBuffer);
        strBuffer = "";
        add = true;
        divide = false;
        subtract = false;
        multiply = false;
      }
    }
  }

  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    new RichardDavisCalculator();
  }
}
