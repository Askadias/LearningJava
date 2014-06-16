package ru.forxy.patterns.creational;

import junit.framework.TestSuite;
import ru.forxy.patterns.creational.abstractfactory.AbstractFactoryTest;
import ru.forxy.patterns.creational.builder.BuilderTest;
import ru.forxy.patterns.creational.factorymethod.FactoryMethodTest;
import ru.forxy.patterns.creational.objectpool.ObjectPoolTest;
import ru.forxy.patterns.creational.prototype.PrototypeTest;
import ru.forxy.patterns.creational.singleton.SingletonTest;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:38
 * To change this template use File | Settings | File Templates.
 */
public class CreationalPatternsTestSuite extends TestSuite {

    public CreationalPatternsTestSuite() {
        addTestSuite(SingletonTest.class);
        addTestSuite(FactoryMethodTest.class);
        addTestSuite(AbstractFactoryTest.class);
        addTestSuite(BuilderTest.class);
        addTestSuite(PrototypeTest.class);
        addTestSuite(ObjectPoolTest.class);
    }
}
