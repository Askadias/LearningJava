package ru.forxy.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(HashMap<String, Expression> variables) {
        if (variables.get(name) == null) return 0;
        else return variables.get(name).interpret(variables);
    }
}
