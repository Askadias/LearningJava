package ru.forxy.patterns.creational.singleton;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class SingletonTest extends TestCase {

    private Logger log = Logger.getLogger(SingletonTest.class.toString());

    public void testSingletonCreation() {
        Singleton singleton = Singleton.getInstance();
        log.info("Creating singleton instance");
        assertNotNull("Singleton cannot be null", singleton);
    }
}
