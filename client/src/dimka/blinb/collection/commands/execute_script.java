package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;
import dimka.blinb.collection.utilities.CommandDispatcher;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class execute_script extends ICommand implements Serializable {
    public execute_script(){
        super(2);
    }
    /**
     * Read file and execute commands in file
     * @return
     * @throws IOException
     **/

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String toString(){
        return "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}
