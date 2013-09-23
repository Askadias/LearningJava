package ru.forxy.patterns.creational.factorymethod;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 1:29
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCreatorB extends Creator {

    public Product factoryMethod() {
        return new ProductB();
    }
}
