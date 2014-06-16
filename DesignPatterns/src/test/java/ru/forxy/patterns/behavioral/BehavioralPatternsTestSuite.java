package ru.forxy.patterns.behavioral;

import junit.framework.TestSuite;
import ru.forxy.patterns.behavioral.command.CommandTest;
import ru.forxy.patterns.behavioral.interpreter.InterpreterTest;
import ru.forxy.patterns.behavioral.mediator.MediatorTest;
import ru.forxy.patterns.behavioral.memento.MementoTest;
import ru.forxy.patterns.behavioral.observer.ObserverTest;
import ru.forxy.patterns.behavioral.responsibility.ResponsibilityChainTest;
import ru.forxy.patterns.behavioral.servant.ServantTest;
import ru.forxy.patterns.behavioral.state.StateTest;
import ru.forxy.patterns.behavioral.strategy.StrategyTest;
import ru.forxy.patterns.behavioral.templatemethod.TemplateMethodTest;
import ru.forxy.patterns.behavioral.visitor.VisitorTest;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:38
 * To change this template use File | Settings | File Templates.
 */
public class BehavioralPatternsTestSuite extends TestSuite {

    public BehavioralPatternsTestSuite() {
        addTestSuite(CommandTest.class);
        addTestSuite(InterpreterTest.class);
        addTestSuite(ResponsibilityChainTest.class);
        addTestSuite(MediatorTest.class);
        addTestSuite(MementoTest.class);
        addTestSuite(ObserverTest.class);
        addTestSuite(ServantTest.class);
        addTestSuite(StateTest.class);
        addTestSuite(StrategyTest.class);
        addTestSuite(TemplateMethodTest.class);
        addTestSuite(VisitorTest.class);
    }
}
