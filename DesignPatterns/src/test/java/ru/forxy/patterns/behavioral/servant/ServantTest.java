package ru.forxy.patterns.behavioral.servant;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class ServantTest extends TestCase {

    private Logger log = Logger.getLogger(ServantTest.class.toString());

    public void testServant() {
        log.info("Creating state context");
        Servant servant = new Servant();
        Master masterA = new MasterA();
        Master masterB = new MasterA();
        servant.move(masterA, 0, 0);
        servant.move(masterB, 1, 1);
        assertEquals("MasterA.x should be 0", 0, masterA.getPosition().getX());
        assertEquals("MasterA.y should be 0", 0, masterA.getPosition().getY());
        assertEquals("MasterB.x should be 1", 1, masterB.getPosition().getX());
        assertEquals("MasterB.y should be 1", 1, masterB.getPosition().getY());
        servant.move(masterA, 5, 4);
        servant.move(masterB, 3, 2);
        assertEquals("MasterA.x should be 5", 5, masterA.getPosition().getX());
        assertEquals("MasterA.y should be 4", 4, masterA.getPosition().getY());
        assertEquals("MasterB.x should be 3", 3, masterB.getPosition().getX());
        assertEquals("MasterB.y should be 2", 2, masterB.getPosition().getY());
    }
}
