package dimka.blinb.collection.utilities;

import dimka.blinb.collection.exception.IncorrectCommand;
import dimka.blinb.collection.exception.NameIsEmpty;
import dimka.blinb.collection.exception.OutOfRange;
import dimka.blinb.collection.interfaces.*;

import java.io.*;
import java.util.*;


public class CommandDispatcher implements ICommandDispatcher {
    public static Boolean IS_LOGGED = false;
    public static Boolean IS_WORKING = true;
    private static Map <String, ICommandHandler> mapOfCommandHandler = new TreeMap<>();
    private static LinkedList<String> history = new LinkedList<String>();
    private static Collection collection;

    public CommandDispatcher(Collection collection) throws FileNotFoundException {
        this.collection = collection;
    }
    /**
     * Adding available command
     * @param commands
     */
    public void addCommands(ICommandHandler... commands){
        for (ICommandHandler command: commands){
            mapOfCommandHandler.put(command.getName(), command);
        }
    }
    public Collection getCollection() { return this.collection; }
    public Map getmapOfCommandHandler(){
        return mapOfCommandHandler;
    }
    public LinkedList<String> getHistory(){
        return history;
    }
    private void addToHistory(String command){
        this.getHistory().addFirst(command);
        if (this.getHistory().size()>5)
            this.getHistory().removeLast();
    }

    /**
     * Handle the current command out
     * @return
     */
    public Notification handle(ICommand cmd) throws IOException, NameIsEmpty, OutOfRange { //save path
        try {
            return mapOfCommandHandler.get(cmd.getName()).execute(this);
        }catch (Exception e){
            e.printStackTrace();
            return new Notification(e.toString());
        }
    }
}
