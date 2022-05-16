package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.Serializable;

public class filter_starts_with_name extends ICommand implements Serializable {
    public filter_starts_with_name(){
        super(2);
    }

    @Override
    public String getName() {
        return "filter_starts_with_name";
    }

    @Override
    public String toString(){
        return "Return all elements that starts with name \"NAME\"";
    }
}
