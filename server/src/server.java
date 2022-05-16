import dimka.blinb.collection.utilities.*;
import dimka.blinb.collection.interfaces.*;

import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @author DimkaBlinb
 * @version lab7.server
 * */

public class server {
    /**
     * Main class
     */
    public static void main(String[] args) throws Exception {
        CreateServer.create();
        CreateServer.commandDispatcher.getCollection().openFile("C:\\Users\\dimka\\IdeaProjects\\lab6_client\\lab_6_client\\src\\File.txt");
        while (!CreateServer.server.isClosed()) {
            Socket socket = CreateServer.server.accept();
            System.out.println("Connecting: " + socket.getLocalAddress() + " " + socket.getPort());

            try {
                ServerSender serverSender = new ServerSender(socket);
                ServerReceiver serverReceiver = new ServerReceiver(socket);
                while (CreateServer.collection.IS_WORKING) {
                    try{
                        ICommand cmd = serverReceiver.receive();
                        // The command has delivered
                        System.out.println(cmd.toString());
                        Notification notification = CreateServer.commandDispatcher.handle(cmd);
                        serverSender.send(notification);
                    } catch (SocketTimeoutException e){

                    }

                }
            }catch (Exception e){
                System.err.println(e.fillInStackTrace());
            }
        }
    }
}
