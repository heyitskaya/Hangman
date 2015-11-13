public class HangmanGame
{
    private Dictionary dictionary; //declare variable of type Dictionary
    private ArrayFunctions arrayFunctions;  //declare variable of type ArrayFunctions
    public String word; //declare this as public because I will need to use this again in playHangman
		
    private  int strikes;//declare variable of type int
    private static int NUMBER_STRIKES=7; //declare variable NUMBER_STRIKES=7 this does not change!
    private  String[] currentWordArray; 
    private Boolean[] currentGuessArray;//declare variable of type Array
		
		
    public HangmanGame() //constructor code
    {
	dictionary= new Dictionary();//this instantiates a new instance of Dictionary

       	arrayFunctions=new ArrayFunctions();//this turns word to array or array to word

	initGame(); //call initGame
			
    }
		
    public void initGame() //instance method
    {
	

	word = dictionary.makeWord(); //call the makeWord method and assign it to word


	currentWordArray=arrayFunctions.stringToArray(word); //call the stringToArray method with parameter word and assign it to currentWordArray
				
	strikes=0; //set strikes to 0

	initGuess();//call initGuess
    }
		
		
    public void initGuess()//initGuess takes in no parameters and has a void return
    {
	int lengthOfWord=word.length(); //assign the length of the word generated to variable lengthOfWord which is of type int
	currentGuessArray=new Boolean[lengthOfWord]; //get a new Array of length equal to lengthOfWord and assign it to global variable currentGuessArray
	for (int i=0;i<lengthOfWord;i++) // for loop with variable i starting at zero going to length of word with increments of 1
	    {
		currentGuessArray[i]=false; //set everything in the array to boolean false
	    }
	
    }
		
		
    public void guessLetter(String letter)   //guessLetter takes in a single parameter of type String and has a void return
    {
	
	Boolean userSeen=false; //gets false and when it sees the letter in the string it will get set to true
	       
	
	for (int i =0; i<currentWordArray.length; i++) //for loop with i starting at 0 and going to the length of the currentWordArray with increments of 1
	    {
		
		//trace("i = " + i + "\ncurrentWordArray[i] = ." + currentWordArray[i] + ".\nletter = ." + letter + "."); //this is to debug
		if (currentWordArray[i].equals(letter)) //if the letter is found in the array
		    {
			userSeen=true; //set boolean value to true
			currentGuessArray[i]=true ;//if letter is in currentWordArray the boolean value in currentGuessArray at index i gets updated to true
			//don't need to update strikes
		    }//else do nothing
		
	    }
	
	//trace("userSeen= "+userSeen); //for debugging
	
	if (userSeen==false) //if after it has walked through the entire function and userSeen is still false
	    {
		//update strike when we walk through entire string and userSeen is still false
		strikes=strikes+1; //we will update strikes
	    }
	
	
    }
    public String getCurrentGuessArray()//getCurrentGuessArray takes in no parameters and returns a String
    {
	String emptyString=""; //declare an empty string
	for (int j=0 ; j<word.length() ; j++) //for loop with variable j with range [0,,word.length-1] with increments of 1
	    {
		if (currentGuessArray[j]==false) //if the currentGuessArray at index j is false
		
		    {
				emptyString=emptyString+ "?"; //add "?" to the empty string
			
		    }
		else //
		    {
				emptyString=emptyString+ currentWordArray[j]; //or else add on the letter
			
		    }
		
			
	    }

	return emptyString; //return it
	
    }
    public int numberOfStrikes()//numberOfStrikes takes in no parameters and returns an int of the number of strikes against the player so far
    {
		
	return strikes; //return the how many strikes there are
	
    }
    public int numberOfRemainingStrikes()//numberOfRemainingStrikes takes in no parameters and returns an int of the number of remaining strikes the player has left
    {
	if (NUMBER_STRIKES-strikes>=0) //return only if the numberOfRemainingStrikes is a non negative number
	    {
		return NUMBER_STRIKES-strikes; //return how many strikes you have left
	    }
	return 0; //or else return 0
    }
    public String getAnswer()
    //gets the answer when called by returning wordd
    {
	return word; 
    }//return this word
		
    public String intToString( int i  )
    {
	// You should not understand this right now!
	return Integer.toString(i); //return this 
    }
    
		


	
    //trace it


		
																																   
}


//bugs I've debugged
//forgot to include a previous function which has a variable present in the current function i  am trying to call
//forgot to write the type of an array
		
		
		
