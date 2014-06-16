package ru.forxy.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Evaluator implements Expression {

    private Expression syntaxTree;

    public Evaluator (String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();
        for (String token: expression.split(" ")) {
            if (token.equals("+")) {
                expressionStack.push(new Plus(expressionStack.pop(), expressionStack.pop()));
            } else if (token.equals("-")) {
                expressionStack.push(new Minus(expressionStack.pop(), expressionStack.pop()));
            } else {
                expressionStack.push(new Variable(token));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret(HashMap<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
