package ru.forxy.patterns.behavioral.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Observable {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
