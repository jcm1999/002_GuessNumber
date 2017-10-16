import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {
	
	//"Field" Very Important is "Scope"
	// "Public" means any other class has access; usually BAD!
	// "Private" means only used inside of this class; ususally this is very good!
	// "Protected" means can be used by any other class in this package
	// default is Protected
	private int lowerLimit = 0;
	private int upperLimit = 10;
	
	Random rand = new Random();
	
	Scanner keyboard = new Scanner(System.in);
	
	/*
	 * 1. set lower and upper bounds on the numbers, like 0 - 10 
	 * 2. pick a random number in that range 
	 * 3. start looping -- 
	 * -- guess 
	 * -- check for win also give high or low feed back
	 * -- if win congrats! 
	 * -- if no win repeat 
	 * -- set a guess limit, like after 5 tries game over
	 */

	public GuessNumber() {

		// placeholder, but essential - a constructor reserves computer memory

	} // end of constructor

	public void startGame() {
		
		Boolean gameRunning = true;
		int guess;
		int countLimit = 5;
		String startMsg = "";
		String enterGuess = "";
		
		// get a new random number
		// example of "method scope" -- can ONLY exist inside of this method
		int answer = rand.nextInt(upperLimit) + lowerLimit;
		//System.out.println("...for testing answer = " + answer);
		startMsg = "...for testing answer = " + answer;
		JOptionPane.showMessageDialog(null, startMsg);
		//upperLimit -1 because it is exclusive, stops 1 number before
		
		
		// later: test for bounds
		
		// ok, check for a win
		// YO! Pay attention! == is a test operator, AWAYS used in ifs
		
		while(gameRunning && countLimit > 0) {
			//System.out.println("\nPlease enter you guess, between " + lowerLimit + " and " + (upperLimit - 1));
			enterGuess = "Please enter you guess, between " + lowerLimit + " and " + (upperLimit - 1);
			//guess = keyboard.nextInt();
			guess = Integer.parseInt(JOptionPane.showInputDialog(enterGuess));
			//System.out.println("Guess = " + guess + "\n");
			
			
			//test -- remove once we see everything working properly
			//System.out.println("Testing: countLimit = " + countLimit);
			
				
			if (guess == answer) {
				//System.out.println("Congrats! You won!");
				JOptionPane.showMessageDialog(null, "Congrats! You won!");
				gameRunning = false;
			}
			else if (guess < answer) {
				//System.out.println("Sorry, your guess is too low");
				JOptionPane.showMessageDialog(null, "Sorry, your guess is too low");
			}
			else if (guess > answer) {
				//System.out.println("Sorry, your guess is too high");
				JOptionPane.showMessageDialog(null, "Sorry, your guess is too high");
			}
			else {
				//System.out.println("Whaaat?? I don't understand!");
				JOptionPane.showMessageDialog(null, "Whaaat?? I don't understand!");
			}	
			
			countLimit--;
					
		} // end while
		
		/*
		 * Your task! Add conditionals for custom comments
		 * like -- win in 1 or 2 tries "Whoa You are AWESOME"
		 * win in 3-4 tries "Yes! You are really good"
		 * win in 5 tries "Whew! You barely made it, but a win is a win!"
		 */
		//System.out.println("\nAll Done, CU later!");// testing only
		
		JOptionPane.showMessageDialog(null, "All Done, CU later!");
		//build an if -- else if -- else stack for custom congrats
		

	} // end of startGame

} // end of class
