package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.Serializable;

public class show extends ICommand implements Serializable {
    static final long serialVersionUID = 0L;
    /**
     * Showing the collection
     **/

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String toString(){
        return "Showing the collection";
    }
}
