package projectFour;

public class InvalidMonthNumber extends Exception{
	//Parameterless Constructor
    public InvalidMonthNumber() {}

    //Constructor that accepts a message
    public InvalidMonthNumber(String message)
    {
       super(message);
    }
    
}