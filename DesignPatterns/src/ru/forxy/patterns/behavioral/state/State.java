package ru.forxy.patterns.behavioral.state;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public interface State {

    public String getName();

    public void process(StateContext context, String param);
}
