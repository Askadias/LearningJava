package ru.forxy.patterns.behavioral.command;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class CommandTest extends TestCase {

    private Logger log = Logger.getLogger(CommandTest.class.toString());

    public void testCommand() {
        log.info("Creating commands, invoker and receiver");
        Receiver receiver = new Receiver();
        Command command1 = new Command1(receiver);
        Command command2 = new Command2(receiver);
        Invoker invoker = new Invoker(command1, command2);

        log.info("Invoke command1");
        invoker.command1();
        assertEquals("Data should be handled by handler1", 1, receiver.getState());
        log.info("Invoke command2");
        invoker.command2();
        assertEquals("Data should be handled by handler2", 2, receiver.getState());
    }
}
