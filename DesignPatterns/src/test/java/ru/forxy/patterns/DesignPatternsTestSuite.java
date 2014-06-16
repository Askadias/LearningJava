package ru.forxy.patterns;

import junit.framework.TestSuite;
import ru.forxy.patterns.behavioral.BehavioralPatternsTestSuite;
import ru.forxy.patterns.creational.CreationalPatternsTestSuite;
import ru.forxy.patterns.structural.StructuralPatternsTestSuite;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:37
 * To change this template use File | Settings | File Templates.
 */
public class DesignPatternsTestSuite extends TestSuite {

    public DesignPatternsTestSuite() {
        addTest(new CreationalPatternsTestSuite());
        addTest(new StructuralPatternsTestSuite());
        addTest(new BehavioralPatternsTestSuite());
    }
}
