package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.Serializable;

public class clear extends ICommand  implements Serializable {

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String toString(){
        return "Clear the collection.";
    }
}