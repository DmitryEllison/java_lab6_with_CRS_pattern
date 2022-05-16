package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.IOException;
import java.io.Serializable;

public class info extends ICommand implements Serializable {
    static final long serialVersionUID = 1L;
    /**
     * Return information about the collection.
     *
     * @return
     * @throws IOException
     */

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String toString(){
        return "Return information about the collection.";
    }
}
