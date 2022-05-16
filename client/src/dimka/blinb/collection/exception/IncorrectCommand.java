package dimka.blinb.collection.exception;

public class IncorrectCommand extends Exception{
    public IncorrectCommand(){
        super("Please input correct command or input \"help\" to see all allowed commands.");
    }
}
