package ru.forxy.patterns.behavioral.mediator;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class MediatorTest extends TestCase {

    private Logger log = Logger.getLogger(MediatorTest.class.toString());

    public void testMediator() {
        log.info("Creating evaluator");
        Mediator mediator = new Mediator();
        CommandA commandA = new CommandA(mediator, "A");
        CommandB commandB = new CommandB(mediator);
        mediator.registerCommandA(commandA);
        mediator.registerCommandB(commandB);

        assertEquals("CommandA state should be A", "A", commandA.getState());
        log.info("Invoke commandA");
        commandA.execute();
        assertEquals("CommandA state should be M1", "M1", commandA.getState());
        assertEquals("CommandB state should be 1", 1, commandB.getState());

        log.info("Invoke commandB");
        commandB.execute();
        assertEquals("CommandA state should be M2", "M2", commandA.getState());
        assertEquals("CommandB state should be 2", 2, commandB.getState());
    }
}
