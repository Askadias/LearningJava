package ru.forxy.patterns;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:50
 * To change this template use File | Settings | File Templates.
 */
public class DesignPatternsTestRunner extends TestCase {

    public void testDesignPatterns() {
        new TestRunner().doRun(new DesignPatternsTestSuite());
    }
}
