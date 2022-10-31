package guessNumber;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessNumberFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtstartingNumber;
	private JTextField txtendingNumber;
	private JTextField txtuserGuess;
	private JTextField txtcomputerGuess;
	
Random randomNumberGenerator = new Random();

	/** 
import java.util.Scanner;

public class GuessingGame 
{
    public static void main (String[]args)
    {
        int answer,attemptsNum = 0;
        final int maxAttempts = 5;
        String str, another = "y";
        int [] guess = new int [5];


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(101)+1;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Enter your guess (0 to quit):");
        
            guess[attemptsNum] = scan.nextInt();
            while (guess[attemptsNum] != 0)
            {
                if(guess[attemptsNum]==answer)
                        System.out.println("Right!");
                else if (guess[attemptsNum]<answer)
                    System.out.println("Your guess was too LOW.");
                
                else if (guess[attemptsNum]>answer)
                    System.out.println("Your guess was too HIGH.");
                    break;
            }

            System.out.println("Want to Play again?(y/n)");
            another = scan.next();

            while (guess[attemptsNum] != answer && ++attemptsNum < maxAttempts){
                if (attemptsNum == maxAttempts)
                    System.out.println ("The number was " + answer);
                    guess[attemptsNum] = scan.nextInt();

                    

        
                }
                    System.out.println("The numbers guessed are");
                    attemptsNum = 0;
                    while (guess[attemptsNum] != answer && ++attemptsNum < maxAttempts){
                                     System.out.println (guess[attemptsNum]);

                
                 }
}// instance variables - replace the example below with your own
}
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessNumberFrame frame = new GuessNumberFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuessNumberFrame() {
		addWindowListener(new WindowAdapter() {
		
			public void windowOpened(WindowEvent e) {
				int startingNumber = Integer.valueOf(txtstartingNumber.getText());
				randomNumberGenerator.setSeed(startingNumber);
			}
		});
		setTitle("GuessNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("endingNumber");
		lblNewLabel_1.setBounds(265, 14, 130, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewGuess = new JButton("guessNumber");
		btnNewGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewGuess.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				int endingNumber = Integer.valueOf(txtendingNumber.getText());
		 int newNumber = randomNumberGenerator.nextInt(endingNumber);
		 txtcomputerGuess.setText(String.valueOf(newNumber));
		 if(txtuserGuess.getText().equals (txtcomputerGuess.getText()) == true) {
			 JOptionPane.showMessageDialog(null, "Guess is correct");
		 }
			}
		});
		btnNewGuess.setBounds(10, 204, 85, 21);
		contentPane.add(btnNewGuess);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRestart.addMouseListener(new MouseAdapter() {
		
			
			public void mouseClicked(MouseEvent e) {
				txtuserGuess.setText("");
			}
		});
		btnRestart.setBounds(283, 204, 85, 21);
		contentPane.add(btnRestart);
		
		JLabel lblNewLabel = new JLabel("startingNumber");
		lblNewLabel.setBounds(0, 10, 130, 21);
		contentPane.add(lblNewLabel);
		
		txtstartingNumber = new JTextField();
		txtstartingNumber.setText("1");
		txtstartingNumber.setBounds(0, 30, 130, 19);
		contentPane.add(txtstartingNumber);
		txtstartingNumber.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("userGuess");
		lblNewLabel_2.setBounds(0, 110, 60, 21);
		contentPane.add(lblNewLabel_2);
		
		txtendingNumber = new JTextField();
		txtendingNumber.setText("100");
		txtendingNumber.setBounds(265, 30, 148, 19);
		contentPane.add(txtendingNumber);
		txtendingNumber.setColumns(10);
		
		txtuserGuess = new JTextField();
		txtuserGuess.setBounds(0, 130, 130, 19);
		contentPane.add(txtuserGuess);
		txtuserGuess.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("computerGuess");
		lblNewLabel_3.setBounds(265, 114, 148, 13);
		contentPane.add(lblNewLabel_3);
		
		txtcomputerGuess = new JTextField();
		txtcomputerGuess.setBounds(265, 130, 148, 19);
		contentPane.add(txtcomputerGuess);
		txtcomputerGuess.setColumns(10);
	}
}
