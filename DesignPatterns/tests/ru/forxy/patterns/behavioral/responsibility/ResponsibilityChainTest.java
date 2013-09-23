package ru.forxy.patterns.behavioral.responsibility;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class ResponsibilityChainTest extends TestCase {

    private Logger log = Logger.getLogger(ResponsibilityChainTest.class.toString());

    public void testChain() {
        log.info("Creating chain handlers");
        Handler handler2 = new ChainHandler(null, 2);
        Handler handler1 = new ChainHandler(handler2, 1);

        log.info("Handle data");
        assertEquals("Data should be handled by handler1", "Handler: 1", handler1.handle(100));
        assertEquals("Data should be handled by handler2", "Handler: 2", handler1.handle(1000));
        assertNull(handler1.handle(2000));
    }
}
