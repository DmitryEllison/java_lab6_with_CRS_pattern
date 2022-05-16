package dimka.blinb.collection.commandsHadler;

import dimka.blinb.collection.interfaces.ICommandHandler;
import dimka.blinb.collection.utilities.*;
import dimka.blinb.collection.commands.*;

public class insertHandler extends insert implements ICommandHandler {
    @Override
    public Notification execute(CommandDispatcher cmd) throws Exception{
        cmd.getCollection().add(super.r);
        return new Notification("Success");
    }
}
