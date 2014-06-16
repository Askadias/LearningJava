package ru.forxy.patterns.creational.objectpool;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
public interface IObjectPool<T> {

    public int getSize();

    public int getInstanceCount();

    public int getMaxInstances();

    public void setMaxInstances(int maxValue);

    public T getObject();

    public T waitForObject() throws InterruptedException;

    public void release(T object);
}
