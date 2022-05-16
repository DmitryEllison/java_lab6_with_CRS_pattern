package dimka.blinb.collection.interfaces;

import dimka.blinb.collection.exception.NameIsEmpty;
import dimka.blinb.collection.exception.OutOfRange;
import dimka.blinb.collection.utilities.CommandDispatcher;
import dimka.blinb.collection.utilities.Notification;

import java.io.IOException;


public interface ICommandHandler{
    /**
     * Execute the command.
     **/
    public Notification execute(CommandDispatcher commandDispatcher) throws Exception;
    public String getName();
}
