package ru.forxy.patterns.behavioral.observer;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class ObserverTest extends TestCase {

    private Logger log = Logger.getLogger(ObserverTest.class.toString());

    public void testObserver() {
        log.info("Creating observable with two observers");
        ObservableImpl observable = new ObservableImpl();
        ObserverImpl observer1 = new ObserverImpl();
        ObserverImpl observer2 = new ObserverImpl();
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setState("State1");
        assertEquals("Observer 1 state should be State1", "Observer: State1", observer1.getState());
        assertEquals("Observer 2 state should be State1", "Observer: State1", observer1.getState());
    }
}
