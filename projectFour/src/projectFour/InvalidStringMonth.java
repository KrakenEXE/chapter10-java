package projectFour;

public class InvalidStringMonth extends Exception{
	//Parameterless Constructor
    public InvalidStringMonth() {}

    //Constructor that accepts a message
    public InvalidStringMonth(String message)
    {
       super(message);
    }
    
}