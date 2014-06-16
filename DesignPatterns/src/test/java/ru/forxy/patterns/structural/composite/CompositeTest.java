package ru.forxy.patterns.structural.composite;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class CompositeTest extends TestCase {

    private Logger log = Logger.getLogger(CompositeTest.class.toString());

    public void testComposite() {
        log.info("Creating composite components");
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite2.add(leaf2);
        composite2.add(leaf3);
        composite1.add(leaf1);
        composite1.add(composite2);
        composite1.operation();
    }
}
