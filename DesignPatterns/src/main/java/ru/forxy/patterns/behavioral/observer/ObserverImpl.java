package ru.forxy.patterns.behavioral.observer;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObserverImpl implements Observer{

    private String state;

    public String getState() {
        return state;
    }

    public void notify(Observable observable) {
        if (observable instanceof ObservableImpl) {
            state = "Observer: " + ((ObservableImpl) observable).getState();
        }
    }
}
