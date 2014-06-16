package ru.forxy.patterns.behavioral.templatemethod;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class TemplateMethodTest extends TestCase {

    private Logger log = Logger.getLogger(TemplateMethodTest.class.toString());

    public void testTemplateMethod() {
        log.info("Creating template implementations A and B");
        Template templateA = new ImplementationA();
        Template templateB = new ImplementationB();
        templateA.method1();
        assertEquals("Template result should be 1", 1, templateA.method2());
        assertEquals("Template result should be A3 0", "A3 0", templateA.method3(0));
        templateB.method1();
        assertEquals("Template result should be 2", 2, templateB.method2());
        assertEquals("Template result should be B3 0", "B3 0", templateB.method3(0));
    }
}
