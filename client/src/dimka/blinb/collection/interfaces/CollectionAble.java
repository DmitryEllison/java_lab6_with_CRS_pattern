package dimka.blinb.collection.interfaces;

import dimka.blinb.collection.objects.Route;

import java.util.LinkedHashMap;
import java.util.Map;

public interface CollectionAble {
    public Map<Object, Object> myMap = null;

    /**
     * Getting the Map (or another class extended from Map)
     **/
    LinkedHashMap getLHM();

    /** Adding the Route class instance.
     * <p>Adding the element in collection LHM and sorting happens immediately.</p>
     * Firstly check the collection for being empty,
     * if it is true the function just use Map.put() method.
     * In another way the function put the new element in the collection
     * to specific position to stay sorted.
     *      1. If collection already has the KEY of the element we update a value of the element
     *      2. else if our collection is empty we just put the element
     *      3. else putting the new element and sorting collection by using Stream API
     * @param route
     **/
    boolean add(Route route);

}
