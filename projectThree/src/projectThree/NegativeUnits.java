package projectThree;

public class NegativeUnits extends Exception{

	
    //Parameterless Constructor
    public NegativeUnits() {}

    //Constructor that accepts a message
    public NegativeUnits(String message)
    {
       super(message);
    }
    
}