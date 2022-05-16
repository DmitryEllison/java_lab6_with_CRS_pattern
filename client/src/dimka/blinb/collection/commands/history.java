package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;
import dimka.blinb.collection.utilities.CommandDispatcher;

import java.io.IOException;
import java.io.Serializable;

public class history extends ICommand implements Serializable {
    static final long serialVersionUID = 2L;
    /**
     * Return last 5 commands
     * @return
     * @throws IOException
     */

    @Override
    public String getName() {
        return "history";
    }

    @Override
    public String toString(){
        return "Return history of commands";
    }
}
