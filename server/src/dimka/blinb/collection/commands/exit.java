package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.Serializable;

public class exit extends ICommand implements Serializable {
    /**
     * Closing the program without saving
     * @return
     */

    @Override
    public String toString(){
        return "Closing the program without saving";
    }

    @Override
    public String getName(){
        return "exit";
    }
}
