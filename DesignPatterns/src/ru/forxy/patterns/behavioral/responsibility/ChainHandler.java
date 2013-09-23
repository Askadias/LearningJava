package ru.forxy.patterns.behavioral.responsibility;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChainHandler implements Handler {

    Handler next;
    int id;
    int limit;

    public ChainHandler(Handler handler, int id) {
        this.next = handler;
        this.id = id;
        this.limit = id * 1000;
    }

    public String handle(int data) {
        if (data < limit) {
            return "Handler: " + id;
        } else if (next != null) {
            return next.handle(data);
        } else {
            return null;
        }
    }
}
