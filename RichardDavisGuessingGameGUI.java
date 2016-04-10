import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * This class creates a simple guessing game GUI
 * Author: Richard Davis
 */
public class RichardDavisGuessingGameGUI extends JFrame
{
  private int randomNumber;
  private int lastGuess;

  // swing components
  private JPanel panel;
  private JLabel introLabel;
  private JLabel guessLabel;
  private JLabel hintLabel;
  private JTextField numberTextField;
  private JButton guessButton;
  private JButton retryButton;
  private final int WINDOW_WIDTH = 600;
  private final int WINDOW_HEIGHT = 300;

  /**
   * This method instantiates a SavingsAccount object a default balance of 0
   *
   */
  public RichardDavisGuessingGameGUI()
  {
    // generates the random number
    randomNumber = (int)(Math.random() * 2000 + 1);
    // set lastGuess to 0
    lastGuess = 0;
    // set window title
    setTitle("Guessing Game");
    // set window size
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    // set close button to exit program
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // prepares panel
    buildPanel();
    // add panel to content frame
    add(panel);
    // display the window
    setVisible(true);
  }

  /**
   * This method adds label, text field, and button to panel
   *
   */
  private void buildPanel()
  {
    introLabel = new JLabel("I have a number between 1 and 2000. Can you guess my number?");
    guessLabel = new JLabel("Enter your first guess");
    numberTextField = new JTextField(5);
    hintLabel = new JLabel("");
    guessButton = new JButton("Guess");
    guessButton.addActionListener(new GuessButtonListener());
    retryButton = new JButton("Retry");
    retryButton.addActionListener(new RetryButtonListener());
    panel = new JPanel();
    panel.add(introLabel);
    panel.add(guessLabel);
    panel.add(numberTextField);
    panel.add(guessButton);
    panel.add(retryButton);
    panel.add(hintLabel);
  }

  /**
   * This class is an action listener for guess button
   *
   */
  private class GuessButtonListener implements ActionListener
  {
    /**
     * This method executes when the guess button is clicked
     *
     */
    public void actionPerformed(ActionEvent e)
    {
      String input;
      int guess;

      input = numberTextField.getText();
      guess = Integer.parseInt(input);
      if (randomNumber < guess) {
        hintLabel.setText("Too High");
      } else if (randomNumber > guess) {
        hintLabel.setText("Too Low");
      } else {
        hintLabel.setText("Correct");
        numberTextField.setEditable(false);
      }

      if (Math.abs(randomNumber-guess) > Math.abs(randomNumber-lastGuess)) {
        numberTextField.setBackground(Color.BLUE);
      } else if (Math.abs(randomNumber-guess) < Math.abs(randomNumber-lastGuess)) {
        numberTextField.setBackground(Color.RED);
      } else {
        numberTextField.setBackground(Color.WHITE);
      }

      lastGuess = guess;
    }
  }

  /**
   * This method is an action listener for retry button
   *
   */
  private class RetryButtonListener implements ActionListener
  {
    /**
     * This method executes when the retry button is clicked
     *
     */
    public void actionPerformed(ActionEvent e)
    {
      randomNumber = (int)(Math.random() * 2000 + 1);
      lastGuess = 0;
      numberTextField.setEditable(true);
      numberTextField.setBackground(Color.WHITE);
      hintLabel.setText("");
    }
  }

  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    new RichardDavisGuessingGameGUI();
  }
}
