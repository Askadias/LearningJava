package ru.forxy.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(HashMap<String, Expression> variables) {
        return number;
    }
}
