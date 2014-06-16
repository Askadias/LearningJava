package ru.forxy.patterns.creational.objectpool;

import ru.forxy.patterns.creational.factorymethod.Creator;

import java.lang.ref.WeakReference;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/29/11
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyObjectPool implements IObjectPool{

    private static final Object LOCK = new Object();

    private volatile LinkedList<WeakReference> pool = new LinkedList<WeakReference>();

    private Creator creator;
    private Class instanceClass;

    private int size;
    private int maxInstances;
    private int instanceCount;

    public MyObjectPool(Creator creator, Class instanceClass) {
        this(creator, instanceClass, Integer.MAX_VALUE);
    }

    public MyObjectPool(Creator creator, Class instanceClass, int maxInstances) {
        this.creator = creator;
        this.instanceClass = instanceClass;
        this.maxInstances = maxInstances;
    }

    public int getSize() {
        return pool.size();
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public int getMaxInstances() {
        return maxInstances;
    }

    public void setMaxInstances(int maxValue) {
        maxInstances = maxValue;
    }

    public Object getObject() {
        synchronized (LOCK) {
            Object obj = removeObject();
            if (obj == null)
                return obj;
            else if (instanceCount < maxInstances) {
                return createObject();
            }
            return null;
        }
    }

    private Object removeObject() {
        if (pool.size() > 0) {
            Object obj = pool.remove(pool.size()-1);
            instanceCount--;
            return obj;
        } else {
            return null;
        }
    }

    private Object createObject() {
        Object obj = creator.create();
        instanceCount++;
        return obj;
    }

    public Object waitForObject() throws InterruptedException {
        synchronized (LOCK) {
            Object obj = removeObject();
            if (obj != null) {
                return obj;
            } else if (instanceCount < maxInstances) {
                return createObject();
            } else {
                do {
                    LOCK.wait();
                    obj = removeObject();
                } while (obj == null);
                return obj;
            }
        }
    }

    public void release(Object object) {
        if (object == null)
            throw new IllegalArgumentException("Released object cannot be null");
        if (instanceClass.isInstance(object)) {
            synchronized (LOCK) {
                pool.add(new WeakReference(object));
                LOCK.notify();
            }
        }
    }
}
