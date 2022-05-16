package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.IOException;
import java.io.Serializable;

public class remove_lower extends ICommand implements Serializable {
    public Integer key;
    public remove_lower(){
        super(2);
    }
    /**
     * Удалить из коллекции все элементы, меньшие, чем заданный
     *
     * @return
     * @throws IOException
     */

    @Override
    public void initialize(String[] args){
        this.key = Integer.valueOf(args[1]);
    }

    @Override
    public String getName() {
        return "remove_lower";
    }

    @Override
    public String toString(){
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }
}
