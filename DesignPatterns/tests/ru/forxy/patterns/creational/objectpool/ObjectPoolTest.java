package ru.forxy.patterns.creational.objectpool;

import junit.framework.TestCase;
import ru.forxy.patterns.creational.factorymethod.ConcreteCreatorA;
import ru.forxy.patterns.creational.factorymethod.Creator;
import ru.forxy.patterns.creational.factorymethod.Product;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class ObjectPoolTest extends TestCase {

    private Logger log = Logger.getLogger(ObjectPoolTest.class.toString());

    public void testProductPool() throws InterruptedException {
        log.info("Creating creatorA, objectPool and softObjectPool");
        Creator<Product> creatorA =  new ConcreteCreatorA();
        final SoftObjectPool<Product> softObjectPool = new SoftObjectPool<Product>(creatorA);
        softObjectPool.setMaxInstances(1);

        log.info("Getting ProductA from the object pool");

        Executors.newSingleThreadExecutor().submit(new Runnable() {
            public void run() {
                final Product productA = softObjectPool.getObject();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                softObjectPool.release(productA);
            }
        });
        Thread.sleep(100);
        Product anotherProductA = softObjectPool.getObject();
        assertNull("Thread pool should be empty", anotherProductA);
        anotherProductA = softObjectPool.waitForObject();

        assertEquals("Creator A should create ProductA",
                "class ru.forxy.patterns.creational.factorymethod.ProductA",
                anotherProductA.getClass().toString());
        assertEquals("Pool size should be 0", 0, softObjectPool.getSize());
        assertEquals("Pool object instances count should be 1", 1, softObjectPool.getInstanceCount());

        log.info("Return ProductA to the object pool");
        softObjectPool.release(anotherProductA);
        assertEquals("Pool size should be 1", 1, softObjectPool.getSize());

        log.info("Getting ProductA from the object pool one more time");
        anotherProductA = softObjectPool.waitForObject();
        assertEquals("Creator A should create ProductA",
                "class ru.forxy.patterns.creational.factorymethod.ProductA",
                anotherProductA.getClass().toString());
        assertEquals("Pool size should be 0", 0, softObjectPool.getSize());
        assertEquals("Pool object instances count should be 1", 1, softObjectPool.getInstanceCount());

    }
}
