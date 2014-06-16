package ru.forxy.patterns.behavioral.interpreter;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class InterpreterTest extends TestCase {

    private Logger log = Logger.getLogger(InterpreterTest.class.toString());

    public void testInterpreter() {
        log.info("Creating evaluator");
        Evaluator evaluator = new Evaluator("a b c + -");
        HashMap<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("a", new Number(3));
        variables.put("b", new Number(4));
        variables.put("c", new Number(5));

        log.info("Invoke evaluation");
        assertEquals("Calculation result should be 6", 6, evaluator.interpret(variables));
    }
}
