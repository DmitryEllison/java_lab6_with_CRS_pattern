package dimka.blinb.collection.objects;

import java.util.Objects;

/**
 * Point position class for plane or space
 * */
public class Location {
    protected Float x; //Поле не может быть null
    protected long y; //Поле не может быть null
    protected int z = 0;
    protected String name; //Поле не может быть null

    public Location(String name, Float x, long y, Integer z) throws NullPointerException{
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;

        if (Objects.isNull(x) || Objects.isNull(y) || Objects.isNull(name) ){
            throw new NullPointerException("Pleas, enter variables again!");
        }

    }
    public Location(String element) throws NullPointerException{
        String[] vars = element.split(",");
        this.name = vars[0];
        this.x = Float.valueOf(vars[1]);
        this.y = Long.valueOf(vars[2]);
        if (vars.length == 4)
            this.z = Integer.valueOf(vars[3]);

        if (Objects.isNull(x) || Objects.isNull(y) || Objects.isNull(name) ){
            throw new NullPointerException("Pleas, enter variables again!");
        }

    }

    public Location(String name, Float x, Integer y){
        this.x = x;
        this.y = (long) y;
        this.name = name;

        if (Objects.isNull(x) || Objects.isNull(y) || Objects.isNull(name) ){
            throw new NullPointerException("Pleas, enter variables again!");
        }
    }
    @Override
    public String toString(){
        return this.name + "," + String.valueOf(x) + "," + String.valueOf(y) + "," + String.valueOf(z);
    }
}