package ru.forxy.patterns.creational.builder;

import junit.framework.TestCase;
import ru.forxy.patterns.creational.factorymethod.ConcreteCreatorA;
import ru.forxy.patterns.creational.factorymethod.ConcreteCreatorB;
import ru.forxy.patterns.creational.factorymethod.Creator;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class BuilderTest extends TestCase {

    private Logger log = Logger.getLogger(BuilderTest.class.toString());

    public void testProductCreation() {
        log.info("Creating builderA, builderB and director");
        AbstractBuilder builderA =  ConcreteBuilderA.getInstance();
        AbstractBuilder builderB =  ConcreteBuilderB.getInstance();
        Director director = new Director();

        log.info("Build ProductA");
        director.build(builderA);
        assertEquals("First part of productA should be 'PartA'",
                "PartA",
                builderA.getResult().getParts().get(0));
        assertEquals("Second part of productA should be 'PartA'",
                "PartB",
                builderA.getResult().getParts().get(1));

        log.info("Build ProductB");
        director.build(builderB);
        assertEquals("First part of productB should be 'PartX'",
                "PartX",
                builderB.getResult().getParts().get(0));
        assertEquals("Second part of productB should be 'PartY'",
                "PartY",
                builderB.getResult().getParts().get(1));
    }
}
