package dimka.blinb.collection.interfaces;

import dimka.blinb.collection.exception.NameIsEmpty;
import dimka.blinb.collection.exception.OutOfRange;
import dimka.blinb.collection.utilities.CommandDispatcher;

import java.io.IOException;

/**
 * Interface of all commands. Each command should be implements from this Interface.
 */
public class ICommand {
    public Integer EXPECTED_LEN;
    public ICommand(Integer EXPECTED_LEN){
        this.EXPECTED_LEN = EXPECTED_LEN;
    }
    public ICommand(){
        this.EXPECTED_LEN = 1;
    }

    /**
    Initialize the params of the object that the command work with
     */
    public void initialize(String[] args) throws Exception{

    }

    /**
     * Return information about command.
     **/
    public String toString(){
        return null;
    }

    /**
     * Get name of command.
     */
    public String getName(){
        return null;
    }
}
