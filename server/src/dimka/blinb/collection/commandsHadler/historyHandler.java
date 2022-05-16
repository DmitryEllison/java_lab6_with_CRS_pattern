package dimka.blinb.collection.commandsHadler;

import dimka.blinb.collection.commands.history;
import dimka.blinb.collection.interfaces.ICommandHandler;
import dimka.blinb.collection.utilities.CommandDispatcher;
import dimka.blinb.collection.utilities.Notification;

public class historyHandler extends history implements ICommandHandler{
    @Override
    public Notification execute(CommandDispatcher cmd) throws Exception {
        return new Notification(cmd.getCollection().LHMtoString());
    }
}
