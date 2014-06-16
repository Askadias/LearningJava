package ru.forxy.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Plus extends ArithmeticExpression {

    public Plus(Expression left, Expression right) {
        super(left, right);
    }

    public int interpret(HashMap<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
