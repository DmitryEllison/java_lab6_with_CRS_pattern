package dimka.blinb.collection.utilities;

import dimka.blinb.collection.utilities.Notification;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;


public class ClientReceiver {
    /**
     * The constant client.
     */
    public static Socket socket;
    public static Notification receive() throws IOException, ClassNotFoundException, SocketTimeoutException, InterruptedException {
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            Object obj = objectInputStream.readObject();
            Notification notification = (Notification) obj;
            return notification;
        } catch (SocketTimeoutException e){
            System.err.println("Server is sleeping right now! How dare you try to wake it up?");
        }
        return null;
    }
}