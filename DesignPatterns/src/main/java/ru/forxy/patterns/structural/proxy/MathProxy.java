package ru.forxy.patterns.structural.proxy;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 */
public class MathProxy implements IMath {

    IMath math = new MathImpl();

    public double add(double x, double y) {
        return math.add(x, y);
    }

    public double sub(double x, double y) {
        return math.sub(x, y);
    }

    public double mul(double x, double y) {
        return math.mul(x, y);
    }

    public double div(double x, double y) {
        return math.div(x, y);
    }
}
