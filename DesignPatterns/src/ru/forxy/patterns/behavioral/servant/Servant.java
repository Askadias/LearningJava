package ru.forxy.patterns.behavioral.servant;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
public class Servant {

    public void move(Master master, int x, int y) {
        master.setPosition(new Position(x, y));
    }
}
