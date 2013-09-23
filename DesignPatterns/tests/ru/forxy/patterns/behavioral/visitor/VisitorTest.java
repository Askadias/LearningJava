package ru.forxy.patterns.behavioral.visitor;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class VisitorTest extends TestCase {

    private Logger log = Logger.getLogger(VisitorTest.class.toString());

    public void testVisitor() {
        log.info("Creating composite element and two visitors");
        CompositeElement compositeElement = new CompositeElement();
        compositeElement.accept(new PrintVisitor());
        compositeElement.accept(new DoVisitor());
    }
}
