package projectTwo;

public class InvalidTestScore extends Exception{

	
	      //Parameterless Constructor
	      public InvalidTestScore() {}

	      //Constructor that accepts a message
	      public InvalidTestScore(String message)
	      {
	         super(message);
	      }
	      
}