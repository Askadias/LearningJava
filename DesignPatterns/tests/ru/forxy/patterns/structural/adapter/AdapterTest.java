package ru.forxy.patterns.structural.adapter;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class AdapterTest extends TestCase {

    private Logger log = Logger.getLogger(AdapterTest.class.toString());

    public void testAdapter() {
        log.info("Creating adapter with one adaptee instance");
        Target adapter = new Adapter(new Adaptee("1"));
        assertEquals("Target.id should be 1", 1, adapter.getId());
    }
}
