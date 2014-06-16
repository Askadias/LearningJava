package ru.forxy.sample.callcenter;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Call center logic implementation class
 */
public class CallCenter {
    private static final int DEFAULT_CAPACITY = 16;

    private final int capacity;
    private final Queue<Customer> dispatchingQueue = new ConcurrentLinkedQueue<Customer>();
    private final Executor executor = Executors.newCachedThreadPool();
    private final Map<String, Operator> staff = new HashMap<String, Operator>();

    public CallCenter() {
        capacity = DEFAULT_CAPACITY;
    }

    public CallCenter(int queueCapacity) {
        this.capacity = queueCapacity;
    }

    private void dispatch(Customer callingCustomer) {
        if (dispatchingQueue.size() >= capacity) {
            throw new IllegalArgumentException("Sorry but all operators are busy now, please call back later.");
        }
        dispatchingQueue.add(callingCustomer);
    }

    public void registerOperator(String name) {
        Operator operator = new Operator(name, dispatchingQueue);
        staff.put(name, operator);
        executor.execute(operator);
    }

    public void unregisterOperator(String name) {
        Operator operator = staff.get(name);
        if (operator != null) {
            operator.goHome();
        }
    }

    public void stopWorking() {
        for (Operator operator : staff.values()) {
            operator.goHome();
        }
    }

    public void call(Customer customer) {
        if (customer != null) {
            dispatch(customer);
        }
    }

    public int getQueueSize() {
        return dispatchingQueue.size();
    }
}
