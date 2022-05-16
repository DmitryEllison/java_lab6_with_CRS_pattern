package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;
import dimka.blinb.collection.utilities.CommandDispatcher;
import dimka.blinb.collection.utilities.Notification;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class execute_script extends ICommand implements Serializable {
    //public execute_script(){ super(2); }
    /**
     * Read file and execute commands in file
     *
     * @param commandDispatcher
     * @param args
     * @return
     * @throws IOException
     **/

    //@Override
    public Notification execute(CommandDispatcher commandDispatcher, String[] args) throws Exception {
        try{
            String line = "";
            File file = new File(args[1]);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println("\t"+line);
                //commandDispatcher.handle(line.split(" "));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String toString(){
        return "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}
