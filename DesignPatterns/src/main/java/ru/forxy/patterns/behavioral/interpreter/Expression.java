package ru.forxy.patterns.behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Expression {

    public int interpret(HashMap<String, Expression> variables);
}
