package ru.forxy.patterns.behavioral.servant;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */
public class MasterB implements Master {

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
