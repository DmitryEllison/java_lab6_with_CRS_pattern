package dimka.blinb.collection.exception;

public class OutOfRange extends Exception{
    /**
     * This exception calls when a variable is out of his range
     * **/
    public OutOfRange(String message){
        super(message);
    }
}
