package dimka.blinb.collection.exception;

public class NameIsEmpty extends Exception{
    /**
     * This exception calls when a string variable is empty or equals ""
     * **/
    public NameIsEmpty(String message){
        super(message);
    }
}
