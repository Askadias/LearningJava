package ru.forxy.patterns.creational.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 1:51
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteFactory2 extends AbstractFactory {

    public ProductA createProductA() {
        return new ProductA2();
    }
    public ProductB createProductB() {
        return new ProductB2();
    }
}
