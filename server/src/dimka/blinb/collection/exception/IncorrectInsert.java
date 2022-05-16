package dimka.blinb.collection.exception;

public class IncorrectInsert extends Exception{
    public IncorrectInsert(){
        super("Incorrect command to insert a value in the collection! For example:\n" +
                "-insert NameOfRoute {Coordinates(Int,Float);Location(Name,Float,Long);Location(Name,Float,Long);Distance(Float)}");
    }
}
