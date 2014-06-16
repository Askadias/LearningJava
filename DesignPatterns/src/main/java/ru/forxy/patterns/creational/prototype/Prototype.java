package ru.forxy.patterns.creational.prototype;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class Prototype implements Cloneable {

    private int mId;

    public Prototype(int id) {
        this.mId = id;
    }

    public int getId() {
        return mId;
    }

    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
