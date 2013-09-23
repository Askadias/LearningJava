package ru.forxy.patterns.structural.bridge;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class Bridge {

    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public String Operation() {
        return implementor.operation();
    }
}
