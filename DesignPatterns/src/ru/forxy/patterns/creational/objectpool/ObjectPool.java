package ru.forxy.patterns.creational.objectpool;

import ru.forxy.patterns.creational.factorymethod.Creator;

import java.lang.reflect.Array;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class ObjectPool implements IObjectPool{

    private int mSize;

    private Object[] mPool;

    private Creator mCreator;

    private int mInstanceCount;

    private int mMaxInstances;

    private Class mPoolClass;

    private static final Object SYNC = new Object();

    public ObjectPool(Class poolClass, Creator creator, int capacity, int maxInstances) {
        mSize = 0;
        mCreator = creator;
        mMaxInstances = maxInstances;
        mPool = (Object[]) Array.newInstance(poolClass, capacity);
    }

    public int getSize() {
        return mSize;
    }

    public int getInstanceCount() {
        return mInstanceCount;
    }

    public int getCapacity() {
        return mPool.length;
    }

    public void setCapacity(int newValue) {
        if (newValue <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero: " + newValue);
        }
        synchronized (SYNC) {
            Object[] newPool = new Object[newValue];
            System.arraycopy(mPool, 0, newPool, 0, newValue);
            mPool = newPool;
        }
    }

    public int getMaxInstances() {
        return mMaxInstances;
    }

    public void setMaxInstances(int maxValue) {
        mMaxInstances = maxValue;
    }

    public Object getObject() {
        synchronized (SYNC) {
            if (mSize > 0) {
                return removeObject();
            } else if (getInstanceCount() < getMaxInstances()) {
                return createObject();
            } else {
                return null;
            }
        }
    }

    public Object waitForObject() throws InterruptedException {
        synchronized (SYNC) {
            if (mSize > 0) {
                return removeObject();
            } else if (getInstanceCount() < getMaxInstances()) {
                return createObject();
            } else {
                do {
                    wait();
                } while (mSize <= 0);
                return removeObject();
            }
        }
    }

    public Object createObject() {
        Object newObject = mCreator.create();
        mInstanceCount++;
        return newObject;
    }

    private Object removeObject() {
        mSize--;
        return mPool[mSize];
    }

    public void release(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        synchronized (SYNC) {
            if (getSize() < getCapacity()) {
                mPool[mSize] = object;
            }
            mSize++;
            SYNC.notify();
        }
    }
}
