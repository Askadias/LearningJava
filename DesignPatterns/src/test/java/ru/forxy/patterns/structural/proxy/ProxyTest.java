package ru.forxy.patterns.structural.proxy;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class ProxyTest extends TestCase {

    private Logger log = Logger.getLogger(ProxyTest.class.toString());

    public void testBridge() {
        log.info("Creating mathImpl and mathProxy");

        IMath mathImpl = new MathImpl();
        IMath mathProxy = new MathProxy();

        assertEquals("mathImpl.add not equal mathProxy.add", mathImpl.add(2, 1), mathProxy.add(2, 1));
        assertEquals("mathImpl.sub not equal mathProxy.sub", mathImpl.sub(2, 1), mathProxy.sub(2, 1));
        assertEquals("mathImpl.mul not equal mathProxy.mul", mathImpl.mul(2, 1), mathProxy.mul(2, 1));
        assertEquals("mathImpl.div not equal mathProxy.div", mathImpl.div(2, 1), mathProxy.div(2, 1));
    }
}
