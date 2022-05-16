package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.IOException;
import java.io.Serializable;

public class print_field_descending_distance extends ICommand implements Serializable {
    /**
     * Вывести значения поля distance всех элементов в порядке убывания
     * @return
     * @throws IOException
     */

    @Override
    public String getName() {
        return "print_field_descending_distance";
    }

    @Override
    public String toString(){
        return "Вывести значения поля distance всех элементов в порядке убывания";
    }
}
