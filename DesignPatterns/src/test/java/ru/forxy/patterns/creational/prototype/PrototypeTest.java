package ru.forxy.patterns.creational.prototype;

import junit.framework.TestCase;
import ru.forxy.patterns.creational.singleton.Singleton;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class PrototypeTest extends TestCase {

    private Logger log = Logger.getLogger(PrototypeTest.class.toString());

    public void testPrototypeClone() throws CloneNotSupportedException {
        log.info("Creating prototype1 instance");
        Prototype prototype1 = new Prototype(1);
        assertEquals("Prototype1 id should be 1", 1, prototype1.getId());
        log.info("Cloning prototype1");
        Prototype prototype2 = prototype1.clone();
        assertNotSame("Prototype1 and Prototype2 should be different", prototype1, prototype2);
        assertEquals("Prototype2 id should be 1", 1, prototype1.getId());
    }
}
