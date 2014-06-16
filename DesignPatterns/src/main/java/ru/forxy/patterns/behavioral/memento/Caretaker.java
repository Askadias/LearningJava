package ru.forxy.patterns.behavioral.memento;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Caretaker {

    private ArrayList<Memento> savedStates = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        savedStates.add(memento);
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }
}
