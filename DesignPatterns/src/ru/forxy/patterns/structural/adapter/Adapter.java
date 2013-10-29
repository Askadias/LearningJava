package ru.forxy.patterns.structural.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/29/11
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        if (adaptee == null)
            throw new IllegalArgumentException("Adaptee cannot be null");
        this.adaptee = adaptee;
    }

    public int getId() {
        return Integer.parseInt(adaptee.getSomeNumberThatLooksLikeId());
    }
}
