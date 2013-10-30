package ru.forxy.patterns.creational.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:25
 * To change this template use File | Settings | File Templates.
 */
public final class Singleton {

    private volatile static Singleton mInstance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (mInstance == null) {
            synchronized (Singleton.class) {
                if (mInstance == null) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
}
