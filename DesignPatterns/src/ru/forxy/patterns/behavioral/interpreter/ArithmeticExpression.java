package ru.forxy.patterns.behavioral.interpreter;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 12:34 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ArithmeticExpression implements Expression {

    protected Expression leftOperand;
    protected Expression rightOperand;

    public ArithmeticExpression(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }
}
