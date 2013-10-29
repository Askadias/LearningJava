package ru.forxy.patterns.creational.objectpool;

import ru.forxy.patterns.creational.factorymethod.Creator;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class SoftObjectPool<T> implements IObjectPool<T>{

    private static final Object SYNC = new Object();

    private List<SoftReference<T>> mPool = new ArrayList<SoftReference<T>>();

    private Creator<T> mCreator;

    private int mInstanceCount;

    private int mMaxInstances;

    public SoftObjectPool(Creator<T> creator) {
        this(creator, Integer.MAX_VALUE);
    }

    public SoftObjectPool(Creator<T> creator, int maxInstances) {
        this.mCreator = creator;
        mMaxInstances = maxInstances;
    }

    public int getSize() {
        synchronized (SYNC) {
            return mPool.size();
        }
    }

    public int getInstanceCount() {
        return mInstanceCount;
    }

    public int getMaxInstances() {
        return mMaxInstances;
    }

    public void setMaxInstances(int maxValue) {
        mMaxInstances = maxValue;
    }

    public T getObject() {
        synchronized (SYNC) {
            T thisObject = removeObject();
            if (thisObject != null) {
                return thisObject;
            }
            if (getInstanceCount() < getMaxInstances()) {
                return createObject();
            } else {
                return null;
            }
        }
    }

    public T waitForObject() throws InterruptedException {
        synchronized (SYNC) {
            T thisObject = removeObject();
            if (thisObject != null) {
                return thisObject;
            }
            if (getInstanceCount() < getMaxInstances()) {
                return createObject();
            } else {
                do {
                    SYNC.wait();
                    thisObject = removeObject();
                } while (thisObject == null);
                return thisObject;
            }
        }
    }

    private T createObject() {
        T newObject = mCreator.create();
        mInstanceCount++;
        return newObject;
    }

    private T removeObject() {
        while (mPool.size() > 0) {
            SoftReference<T> thisRef = mPool.remove(mPool.size() - 1);
            T thisObject = thisRef.get();
            if (thisObject != null) {
                return thisObject;
            }
            mInstanceCount--;
        }
        return null;
    }

    public void release(T object) {
        if (object == null) {
            throw new NullPointerException();
        }
        synchronized (SYNC) {
            mPool.add(new SoftReference<T>(object));
            SYNC.notify();
        }
    }
}
