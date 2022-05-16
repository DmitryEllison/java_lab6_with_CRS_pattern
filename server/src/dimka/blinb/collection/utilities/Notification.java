package dimka.blinb.collection.utilities;

import java.io.Serializable;

/**
 * That class is a message from server to the Client
 */

public class Notification implements Serializable {
    public String message = "EMPTY_STRING";

    public Notification(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return this.message;
    }
}
