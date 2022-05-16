package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.Serializable;

public class help extends ICommand implements Serializable {
    static final long serialVersionUID = 4L;

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String toString(){
        return "Return all available commands";
    }
}
