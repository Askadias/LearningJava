package ru.forxy.patterns.behavioral.memento;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class MementoTest extends TestCase {

    private Logger log = Logger.getLogger(MementoTest.class.toString());

    public void testMemento() {
        log.info("Creating memento, originator and caretaker");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State1");
        assertEquals("Current originator's state should be State1", "State1", originator.getState());
        originator.setState("State2");
        assertEquals("Current originator's state should be State2", "State2", originator.getState());
        caretaker.addMemento(originator.saveToMemento());
        originator.setState("State3");
        assertEquals("Current originator's state should be State3", "State3", originator.getState());
        originator.restoreFromMemento(caretaker.getMemento(0));
        assertEquals("Current originator's state should be State2", "State2", originator.getState());
    }
}
