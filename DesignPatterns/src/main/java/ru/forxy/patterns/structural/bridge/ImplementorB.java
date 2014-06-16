package ru.forxy.patterns.structural.bridge;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */
public class ImplementorB extends Implementor {

    private String id;

    public ImplementorB(String id) {
        this.id = id;
    }

    public String operation() {
        return "Id: " + id;
    }
}
