package dimka.blinb.collection.utilities;

import dimka.blinb.collection.interfaces.ICommand;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerReceiver {
    private Socket client;
    public ServerReceiver(Socket client) {
        this.client = client;
    }

    public ICommand receive(){
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            return (ICommand) objectInputStream.readObject();
        }catch(Exception e){
            System.err.println("Something went wrong with receiving data from client."
                    + client.getLocalAddress() + " " + client.getPort());
        }
        return null;
    }
}