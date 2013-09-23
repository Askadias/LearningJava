package ru.forxy.patterns.structural.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/29/11
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adaptee {

    private String id;

    public Adaptee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
