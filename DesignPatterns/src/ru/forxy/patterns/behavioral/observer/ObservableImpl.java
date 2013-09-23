package ru.forxy.patterns.behavioral.observer;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableImpl implements Observable {

    private LinkedList<Observer> observers = new LinkedList<Observer>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.notify(this);
        }
    }
}
