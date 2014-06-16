package ru.forxy.patterns.behavioral.strategy;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class StrategyTest extends TestCase {

    private Logger log = Logger.getLogger(StrategyTest.class.toString());

    public void testStrategy() {
        log.info("Creating context and setting strategies A and B");
        Context context = new Context(new StrategyA());
        assertEquals("Operation result should be 1", 1, context.executeOperation());
        context.setStrategy(new StrategyB());
        assertEquals("Operation result should be 2", 2, context.executeOperation());
    }
}
