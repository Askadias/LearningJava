package ru.forxy.sample.callcenter;

import java.util.Queue;

/**
 * Operator serves the customer
 */
public class Fresher extends Operator implements Runnable {

    private boolean isWorking = true;

    private Queue<Customer> dispatchingQueue;

    public Fresher(final String name, TechnicalLead technicalLead) {
        super(name, technicalLead);
        this.responsibility = Severity.LOW;
    }

    @Override
    public void run() {
        while (isWorking) {
            if (dispatchingQueue != null && isFree.get()) {
                Customer newCustomer = dispatchingQueue.poll();
                if (newCustomer != null) {
                    if (!serve(newCustomer)) {
                        dispatchingQueue.add(newCustomer);
                    }
                }
            }
        }
    }

    public void goHome() {
        isWorking = false;
    }

    public void setDispatchingQueue(final Queue<Customer> dispatchingQueue) {
        this.dispatchingQueue = dispatchingQueue;
    }
}
