package ru.forxy.patterns.structural.bridge;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class BridgeTest extends TestCase {

    private Logger log = Logger.getLogger(BridgeTest.class.toString());

    public void testBridge() {
        log.info("Creating bridge, custom bridge, implementorA and implementorB");
        Bridge bridge = new Bridge();
        Bridge customBridge = new CustomBridge();
        bridge.setImplementor(new ImplementorA("A"));
        customBridge.setImplementor(new ImplementorB("B"));

        assertEquals("Invalid operation bridge->ImplA invocation", "A", bridge.Operation());
        assertEquals("Invalid operation customBridge->ImplB invocation", "Before: Id: B: after", customBridge.Operation());

        bridge.setImplementor(new ImplementorB("BB"));
        assertEquals("Invalid operation bridge->ImplB invocation", "Id: BB", bridge.Operation());
    }
}
