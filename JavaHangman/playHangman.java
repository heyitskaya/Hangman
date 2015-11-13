/**
 * InteractiveLoopSum.java
 * CS101 
 **/ 
 
// IO
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
// for integer parsing
import java.lang.NumberFormatException;
 
/**
 * InteractiveSum is a simple program that allows a user
 * to interactively sum integers from 1 - n..
 *
 * @author CS 101
 **/
public class playHangman{
    private HangmanGame newHangmanGame;
    
    //declare privare variable called newHangmanGame of type HangmanGame
    /**
     * Constructor just starts input loop.
     **/
    public playHangman() 
    {
	newHangmanGame= new HangmanGame(); //instantiate a new instance of HangmanGame called newHangmanGame
	// call function to start input loop
	readInput();
	  

	

    }
 
    /**
     * Get input from the user, looping until the user types "Quit"
     * or gives an incorrect value.
     **/
    public void readInput()
    {
	// wrap input stream read input from user
	// you do not need to understand what is going on here
	// for now, just take it as is
	BufferedReader in = 
	    new BufferedReader( new InputStreamReader( System.in ) );
 
	// prompt the user for input
	System.out.println("Hangman"); //this is for the player to see
	System.out.println(newHangmanGame.getCurrentGuessArray());//print the guess array for example "????"
	System.out.println(newHangmanGame.numberOfRemainingStrikes()); //print number of remaining strikes
	System.out.println( "Please enter an letter or type Quit to end." ); //print this
	
	
		
		
	// I/O almost always requires a try/catch
	// block as exceptions may be thrown 
	try 
	    {
		String line;
 
		// loop until the user types "Quit"
		do {
 
		    // try to read a line
		    // this function potentially throws an IOException
		    line = in.readLine(); 
		    newHangmanGame.guessLetter(line); //call the method guessLetter with parameter line
		    System.out.println(newHangmanGame.getCurrentGuessArray()); //call method getCurrentGuessArray and print it out
		    System.out.println(newHangmanGame.numberOfRemainingStrikes()); //call method numberOfRemainingStrikes and print it out
		    //System.out.println("!!!!!");
		    if (newHangmanGame.numberOfRemainingStrikes()==0) //if the number of remaining strikes equals to 0
			{
			    System.out.println("You lose"); //print out you lose
			}
		    else if (newHangmanGame.numberOfRemainingStrikes()>0 && (newHangmanGame.getCurrentGuessArray()).equals(newHangmanGame.word)) //else if you still have strikes left and you have guessed the word
			{
			    System.out.println("You win"); //tell the player they won
			    System.out.println ("A new word has been selected. Enter a new letter to begin.");
			    newHangmanGame = new HangmanGame();// instantiate a new HangmanGame
			    
			}
			    
			    
			    
			



 
				
		} while ( (!line.equals( "Quit" ) ) );
	    }
	// catch I/O exception
	catch ( IOException ioe )
	    {
		// tell exception to print its error log
		ioe.printStackTrace();
	    }
    }
 
    /**
     * Special main method is run when the program
     * is executed.
     **/
    public static void main( String[] args )
    {
	// create a new instance of the class to get everything started
	playHangman n1 = new playHangman();
    } // end main
} //end InteractiveSum
