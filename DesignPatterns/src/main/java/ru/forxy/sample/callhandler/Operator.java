package ru.forxy.sample.callhandler;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Operator serves the customer
 */
public abstract class Operator extends Person {

    private final Operator supervisor;
    private Recorder recorder;
    protected Severity responsibility;
    protected AtomicBoolean isFree = new AtomicBoolean(true);

    public Operator(final String name, Operator supervisor) {
        super(name);
        this.supervisor = supervisor;
    }

    public boolean serve(Customer customer) {
        if (isFree.get()) {
            try {
                isFree.compareAndSet(true, false);
                if (responsibility == customer.getSeverity()) {
                    System.out.println(customer.getRequest());
                    log(customer);
                    return true;
                } else if (supervisor != null) {
                    return supervisor.serve(customer);
                }
            } finally {
                isFree.compareAndSet(false, true);
            }
        }
        return false;
    }

    private void log(final Customer customer) {
        if (recorder != null) {
            recorder.log(this, customer, customer.getRequest());
        }
    }

    public void setRecorder(final Recorder recorder) {
        this.recorder = recorder;
        if (supervisor != null) {
            supervisor.setRecorder(recorder);
        }
    }
}
