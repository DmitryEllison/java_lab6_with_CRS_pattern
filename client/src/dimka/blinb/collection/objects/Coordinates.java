package dimka.blinb.collection.objects;

import dimka.blinb.collection.exception.OutOfRange;

import java.util.Objects;

/**
 * Current point coordinates
 * */
public class Coordinates {
    private long x; //Значение поля должно быть больше -888
    private Float y; //Поле не может быть null

    public Coordinates(long x, Float y) throws NullPointerException, OutOfRange {
        this.x = x;
        this.y = y;

        if (Objects.isNull(y)){
            throw new NullPointerException("Pleas, enter variables again!");
        }
        if (x<=-888){
            throw new OutOfRange("X cannot be less than -888");
        }
    }

    public Coordinates(String element) throws NullPointerException, OutOfRange {
        String[] vars = element.split(",");
        this.x = Long.valueOf(vars[0]);
        this.y = Float.valueOf(vars[1]);

        if (Objects.isNull(y)){
            throw new NullPointerException("Pleas, enter variables again!");
        }
        if (x<=-888){
            throw new OutOfRange("X cannot be less than -888");
        }
    }

    @Override
    public String toString(){
        return String.valueOf(x) + "," + String.valueOf(y);
    }
}
