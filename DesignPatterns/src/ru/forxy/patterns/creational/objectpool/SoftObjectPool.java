package ru.forxy.patterns.creational.objectpool;

import ru.forxy.patterns.creational.factorymethod.Creator;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class SoftObjectPool implements IObjectPool{

    private static final Object SYNC = new Object();

    private ArrayList mPool = new ArrayList();

    private Creator mCreator;

    private int mInstanceCount;

    private int mMaxInstances;

    private Class mPoolClass;

    public SoftObjectPool(Class poolClass, Creator creator) {
        this(poolClass, creator, Integer.MAX_VALUE);
    }

    public SoftObjectPool(Class poolClass, Creator creator, int maxInstances) {
        this.mPoolClass = poolClass;
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

    public Object getObject() {
        synchronized (SYNC) {
            Object thisObject = removeObject();
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

    public Object waitForObject() throws InterruptedException {
        synchronized (SYNC) {
            Object thisObject = removeObject();
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

    private Object createObject() {
        Object newObject = mCreator.factoryMethod();
        mInstanceCount++;
        return newObject;
    }

    private Object removeObject() {
        while (mPool.size() > 0) {
            SoftReference thisRef = (SoftReference) mPool.remove(mPool.size() - 1);
            Object thisObject = thisRef.get();
            if (thisObject != null) {
                return thisObject;
            }
            mInstanceCount--;
        }
        return null;
    }

    public void release(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        if (!mPoolClass.isInstance(object)) {
            String actualClassName = object.getClass().getName();
            throw new ArrayStoreException(actualClassName);
        }
        synchronized (SYNC) {
            mPool.add(new SoftReference(object));
            SYNC.notify();
        }
    }
}
