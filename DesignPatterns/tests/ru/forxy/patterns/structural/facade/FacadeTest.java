package ru.forxy.patterns.structural.facade;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class FacadeTest extends TestCase {

    private Logger log = Logger.getLogger(FacadeTest.class.toString());

    public void testFacade() {
        log.info("Creating adapter with one adaptee instance");
        Facade facade = new Facade();
        assertEquals("Invalid facade operation 1 result", "A1A2B1", facade.operation1());
        assertEquals("Invalid facade operation 2 result", "A3B2C1", facade.operation2());
    }
}
