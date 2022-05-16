import dimka.blinb.collection.utilities.*;
import dimka.blinb.collection.commands.*;
import dimka.blinb.collection.interfaces.*;


import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author DimkaBlinb
 * @version lab7.client
 * */

public class client {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) throws Exception {
        // Создание объекта который будет работать с командами
        CommandDispatcher commands = new CommandDispatcher();
        // Добавляем наши команды
        commands.addCommands(
                new execute_script(), new filter_starts_with_name(), new info(), new insert(),
                new print_field_ascending_distance(), new print_field_descending_distance(), new show(),
                new remove_key(), new remove_lower(), new update_id(),
                new history(), new help(), new exit(), new clear());
        // Начало работы с пользователем
        Scanner in = new Scanner(System.in, "windows-1251");

        System.out.println(ANSI_GREEN + "The program is ready to work!" + ANSI_RESET);
        System.out.println("Enter your first command to send it to the Server: ");
        while (CommandDispatcher.IS_WORKING){
            // Подключение
            ClientSender.reconnect();
            // Работа с сервером
            while (ClientSender.SERVER_IS_CONNECTED){
                try {
                    String s = in.nextLine();
                    // Создание объекта комманды с заполненными полями
                    ICommand command  = commands.handle(s.split(" "));
                    if (command != null) {
                        ClientSender.send(command);
                        try {
                            // Get data from server
                            Notification notification = ClientReceiver.receive();
                            // and print it
                            if (notification != null)
                                System.out.println(notification.toString());
                            else
                                System.out.println("Message is empty!" + ANSI_YELLOW +
                                        "\n client.java \n printing notification" + ANSI_RESET);
                        } catch (SocketTimeoutException e) {
                            System.err.println("The Server is not connected or busy right now, try again later.");
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(e.getCause());
                        }
                    }
                } catch (NoSuchElementException | ClassNotFoundException | InterruptedException | SocketException e) {
                    System.err.println(e);
                }

            }
        }
    }
}
