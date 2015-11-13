

public class ArrayFunctions //no instance properties
{
    private static Dictionary dictionary= new Dictionary();
    private static String word = dictionary.makeWord();
		
	
    public void ArrayFunctions() //constructor code
    {
			
    }
		
    public String arrayToString(String[] wordArray)//array2String takes in a single parameter of type Array and returns a String
    {
	String emptyString=""; //declares a variable of type string and make it an empty string
	for( int i=0 ; i<wordArray.length;i++) //for loop for var i in range [0,wordArray.length-1] with increments of 1
	    {
		emptyString+=wordArray[i] ;  //concactenate the letter in wordArray at index i onto the emptyString
		
	    }
	System.out.println (emptyString); //for debugging
	return emptyString; //return the string
			
    }
    public String[] stringToArray(String word) //delcare function with parameter string and output array
    {
	String[] currentArray=new String[word.length()]; //make new empty array with length of the word to hold word
	for ( int j=0 ; j<word.length() ; j++ ) // for loop with variable j which starts at 0 and goes to the word.length-1, with increments of 1
	    {
		currentArray[j]=word.substring(j,j+1); //use substr to get letter out of word and put them in corresponding positions in the currentArray
		//trace ( currentArray[j]);
	    }
	return currentArray; //return
	
    }
}
    	
	

		
		
			
		
	
					
