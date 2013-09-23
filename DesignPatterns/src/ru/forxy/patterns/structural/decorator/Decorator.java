package ru.forxy.patterns.structural.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
public abstract class Decorator implements Component {

    protected Component component;

    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
