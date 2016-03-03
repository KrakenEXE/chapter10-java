package projectThree;

public class NegativePrice extends Exception {

    //Parameterless Constructor
    public NegativePrice() {}

    //Constructor that accepts a message
    public NegativePrice(String message)
    {
       super(message);
    }
    
}