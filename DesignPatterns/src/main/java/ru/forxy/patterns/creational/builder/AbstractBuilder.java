package ru.forxy.patterns.creational.builder;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 9:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractBuilder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
