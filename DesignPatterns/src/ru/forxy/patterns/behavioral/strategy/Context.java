package ru.forxy.patterns.behavioral.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation() {
        return strategy.algorithm();
    }
}
