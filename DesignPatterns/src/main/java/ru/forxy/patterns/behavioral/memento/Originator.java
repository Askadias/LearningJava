package ru.forxy.patterns.behavioral.memento;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
    }
}
