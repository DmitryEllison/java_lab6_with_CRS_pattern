package dimka.blinb.collection.commands;

import dimka.blinb.collection.exception.NameIsEmpty;
import dimka.blinb.collection.exception.OutOfRange;
import dimka.blinb.collection.interfaces.ICommand;
import dimka.blinb.collection.objects.Coordinates;
import dimka.blinb.collection.objects.Location;
import dimka.blinb.collection.objects.Route;

import java.io.IOException;
import java.io.Serializable;

public class insert extends ICommand implements Serializable {
    static final long serialVersionUID = 3L;
    public Route r;
    public insert(){
        super(3);
    }
    /**
     * Insert new element by key [insert KEY {~element~}]
     * // insert NAME {Coordinates(Int,Float);from;to(Name,Float,Long);Float} : добавить новый элемент с заданным ключом
     * insert 3131 {1,1;;Чебоксары,1,1;200.5}
     * @param args
     * @return
     * @throws IOException
     **/

    public void initialize(String[] args) throws IOException, OutOfRange, NameIsEmpty {
        // Parsing the command line
        String newElement = args[2].replace("{", "").replace("}", "") ;
        String[] element = newElement.split(";");

        // Create arguments for Route class
        String name = "";
        for (int i =1; i < args.length-1; i++)
            name += args[i] + " ";
        // Create route object
        Coordinates coordinate = new Coordinates(element[0]);
        Location from = null;
        if (!element[1].equals(""))
            from = new Location(element[1]);
        Location to = new Location(element[2]);
        Float distance = Float.valueOf(element[3]);

        this.r = new Route(name, coordinate, from, to, distance);
    }

    @Override
    public String getName() {
        return "insert";
    }

    @Override
    public String toString(){
        return "Insert new element by key [insert KEY {~element~}]";
    }
}
