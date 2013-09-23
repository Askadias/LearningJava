package ru.forxy.patterns.structural;

import junit.framework.TestSuite;
import ru.forxy.patterns.structural.adapter.AdapterTest;
import ru.forxy.patterns.structural.bridge.BridgeTest;
import ru.forxy.patterns.structural.composite.CompositeTest;
import ru.forxy.patterns.structural.decorator.DecoratorTest;
import ru.forxy.patterns.structural.facade.FacadeTest;
import ru.forxy.patterns.structural.flyweight.FlyweightTest;
import ru.forxy.patterns.structural.proxy.ProxyTest;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:38
 * To change this template use File | Settings | File Templates.
 */
public class StructuralPatternsTestSuite extends TestSuite {

    public StructuralPatternsTestSuite() {
        addTestSuite(AdapterTest.class);
        addTestSuite(BridgeTest.class);
        addTestSuite(FacadeTest.class);
        addTestSuite(CompositeTest.class);
        addTestSuite(DecoratorTest.class);
        addTestSuite(FlyweightTest.class);
        addTestSuite(ProxyTest.class);
    }
}
