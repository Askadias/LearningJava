package ru.forxy.patterns.structural.bridge;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */
public class CustomBridge extends Bridge {

    public String Operation() {
        StringBuilder builder = new StringBuilder("Before: ");
        builder.append(super.Operation());
        builder.append(": after");
        return builder.toString();
    }
}
