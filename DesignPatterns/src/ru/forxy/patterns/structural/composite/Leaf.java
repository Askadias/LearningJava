package ru.forxy.patterns.structural.composite;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
public class Leaf implements Component {

    public void operation() {
        System.out.println("Leaf Op");
    }
}
