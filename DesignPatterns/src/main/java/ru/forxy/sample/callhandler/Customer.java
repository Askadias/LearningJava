package ru.forxy.sample.callhandler;

/**
 * Calling customer performs request
 */
public class Customer extends Person {

    private final Severity severity;

    public Customer(final String name, Severity severity) {
        super(name);
        this.severity = severity;
    }

    public String getRequest() {
        return name + " is calling.";
    }

    public Severity getSeverity() {
        return severity;
    }
}
