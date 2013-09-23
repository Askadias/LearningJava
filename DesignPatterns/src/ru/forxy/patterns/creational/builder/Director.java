package ru.forxy.patterns.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 9:55
 * To change this template use File | Settings | File Templates.
 */
public class Director {

    public void build(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
