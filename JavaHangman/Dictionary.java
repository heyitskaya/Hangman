public class Dictionary
{
    
   
    
    private static String[] dictionaryArray={"flowers","sunshine","donuts","sugar","candy"}; //put words in my array of strings called dictionary
	
    private static String word; // declare instance variable word
   
    private static int randomNumber; //declare instance variable randomNumber
	
    public  Dictionary()//:void  //constructor		
    {
				
    }
				
    public String makeWord() //method called makeWord that returns a string
    {
	randomNumber=(int) Math.floor (Math.random()* dictionaryArray.length); //have the number randomly generated by the computer multiply the length of the array then 
	word=dictionaryArray[randomNumber]; //round it down to get the index number 
	//have the array at index randomNumber in the dictionaryArray assigned tp word
						
						
					
	//System.out.println(word);			
	return word; //return the word
    }
    		
	       
}


				
