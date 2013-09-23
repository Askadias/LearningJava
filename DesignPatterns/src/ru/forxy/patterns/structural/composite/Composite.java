package ru.forxy.patterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
public class Composite implements Component {

    protected List<Component> components = new LinkedList<Component>();

    public void operation() {
        for(Component component: components) {
            component.operation();
        }
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int index) {
        return components.get(index);
    }
}
