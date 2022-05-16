package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.IOException;
import java.io.Serializable;

public class print_field_ascending_distance extends ICommand implements Serializable {
    /**
     * Вывести значения поля distance всех элементов в порядке возрастания
     *
     * @return
     * @throws IOException
     */

    @Override
    public String getName() {
        return "print_field_ascending_distance";
    }

    @Override
    public String toString(){
        return "вывести значения поля distance всех элементов в порядке возрастания";
    }
}
