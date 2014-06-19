package ru.forxy.sample.callcenter;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Call center logic implementation class
 */
public class CallCenter {
    private static final int DEFAULT_CAPACITY = 16;

    private final int capacity;
    private final Queue<Customer> dispatchingQueue = new ConcurrentLinkedQueue<Customer>();
    private final ExecutorService executor = Executors.newCachedThreadPool();
    private final Map<String, Fresher> staff = new HashMap<String, Fresher>();
    private final Recorder recorder = new Recorder();

    public CallCenter() {
        this(DEFAULT_CAPACITY);
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

    public void registerOperator(Fresher fresher) {
        fresher.setDispatchingQueue(dispatchingQueue);
        fresher.setRecorder(recorder);
        staff.put(fresher.getName(), fresher);
        executor.execute(fresher);
    }

    public void unregisterOperator(String name) {
        Fresher operator = staff.get(name);
        if (operator != null) {
            operator.goHome();
        }
    }

    public void stopWorking(final long secondsToWait) throws InterruptedException {
        for (Fresher operator : staff.values()) {
            operator.goHome();
        }
        staff.clear();
        if (!executor.awaitTermination(secondsToWait, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }

    public void call(Customer customer) {
        if (customer != null) {
            dispatch(customer);
        }
    }

    public Recorder getRecorder() {
        return recorder;
    }
}
