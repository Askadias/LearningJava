package ru.forxy.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 0:20
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightFactory {

    private HashMap<Integer, Flyweight> flyweightHashMap = new HashMap<Integer, Flyweight>();

    public Flyweight getFlyweight(Integer key) {
        Flyweight flyweight = flyweightHashMap.get(key);
        if (flyweight == null) {
            if (key == 1)
                flyweight = new ConcreteFlyweightA();
            else
                flyweight = new ConcreteFlyweightB();
            flyweightHashMap.put(key, flyweight);
        }
        return flyweight;
    }
}
