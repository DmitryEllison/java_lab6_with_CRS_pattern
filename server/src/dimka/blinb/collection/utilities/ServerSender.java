package dimka.blinb.collection.utilities;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSender {
    private Socket client;
    private Notification notification;

    public ServerSender(Socket socket){
        this.client = socket;
    }

    public ServerSender(Socket client, Notification notification){
        this.client = client;
        this.notification = notification;
    }
    public void send(Notification notification) throws Exception {
        System.out.println("ќтправл€ю данные клиенту: " + client.getLocalAddress() + client.getPort());
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
            objectOutputStream.writeObject(notification);
            System.out.println(notification.toString());
            objectOutputStream.flush();
        }catch(Exception e){
            System.err.println("Something went wrong with sending notification.");
        }
    }
}
