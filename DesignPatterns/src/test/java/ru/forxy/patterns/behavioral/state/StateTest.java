package ru.forxy.patterns.behavioral.state;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class StateTest extends TestCase {

    private Logger log = Logger.getLogger(StateTest.class.toString());

    public void testState() {
        log.info("Creating state context");
        StateContext context = new StateContext();
        context.setState(new StateA());
        assertEquals("Current state should be StateA", "StateA", context.getState().getName());
        context.getState().process(context, "One");
        assertEquals("Current state should be StateB", "StateB", context.getState().getName());
        context.getState().process(context, "Two");
        assertEquals("Current state should be StateB", "StateB", context.getState().getName());
        context.getState().process(context, "Three");
        assertEquals("Current state should be StateA", "StateA", context.getState().getName());
        context.getState().process(context, "Four");
        assertEquals("Current state should be StateB", "StateB", context.getState().getName());
        context.getState().process(context, "Five");
        assertEquals("Current state should be StateB", "StateB", context.getState().getName());
    }
}
