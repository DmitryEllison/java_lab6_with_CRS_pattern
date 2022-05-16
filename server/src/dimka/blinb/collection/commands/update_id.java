package dimka.blinb.collection.commands;

import dimka.blinb.collection.interfaces.ICommand;
import dimka.blinb.collection.objects.Coordinates;
import dimka.blinb.collection.objects.Location;
import dimka.blinb.collection.objects.Route;

import java.io.IOException;
import java.io.Serializable;

public class update_id extends ICommand implements Serializable {
    public Integer key;
    public Route route;
    public update_id(){
        super(3);
    }
    /**
     * Change the value of element by key (ID).
     *
     * @return
     * @throws IOException
     **/

    @Override
    public void initialize(String[] args){
        try{
            // Parsing the command line
            String value = args[2].replace("{", "").replace("}", "");
            String[] element = value.split(";");

            // Create arguments for Route class
            Coordinates coordinate = new Coordinates(element[1]);
            Location from = null;
            if (!element[2].equals(""))
                from = new Location(element[2]);
            Location to = new Location(element[3]);
            Float distance = Float.valueOf(element[4]);

            // Create instance of Route and hand to collection method on
            Route route = new Route(element[0], coordinate, from, to, distance);
            this.route = route;
            this.key = Integer.valueOf(args[1]);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Incorrect command to insert a value in the collection! For example:\n" +
                    "-update_id ID {Name, Coordinates(Int,Float);Location(Name,Float,Long);Location(Name,Float,Long);Distance(Float)}");
        }
    }

    @Override
    public String getName() {
        return "update_id";
    }

    @Override
    public String toString(){
        return "Change the value of element by key (ID).";
    }
}
