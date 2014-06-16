package ru.forxy.sample.callcenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Operator serves the customer
 */
public class Operator extends Person implements Runnable {

    private boolean isWorking = true;

    private final Queue<Customer> dispatchingQueue;

    private final List<Integer> rates = new ArrayList<Integer>();

    public Operator(final String name, final Queue<Customer> dispatchingQueue) {
        super(name);
        this.dispatchingQueue = dispatchingQueue;
    }

    public void serve(Customer customer) {
        System.out.println(customer.getRequest());
    }

    @Override
    public void run() {
        while (isWorking) {
            Customer newCustomer = dispatchingQueue.poll();
            if (newCustomer != null) {
                serve(newCustomer);
                newCustomer.rate(this);
            }
        }
    }

    public void goHome() {
        isWorking = false;
    }

    public void rate(Integer rate) {
        rates.add(rate);
    }

    public List<Integer> getRates() {
        return rates;
    }
}
