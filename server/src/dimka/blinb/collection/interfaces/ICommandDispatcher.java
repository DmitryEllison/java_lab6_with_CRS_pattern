package dimka.blinb.collection.interfaces;

import dimka.blinb.collection.utilities.Notification;

/**
 * определение способа централизованного вызова обработчиков команд в зависимости
 * от конкретного типа переданной команды (ICommand)
 */
public interface ICommandDispatcher{
    public Notification handle(ICommand cmd) throws Exception;
}
