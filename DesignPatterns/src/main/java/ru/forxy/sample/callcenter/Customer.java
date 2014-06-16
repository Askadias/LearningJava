package ru.forxy.sample.callcenter;

import java.util.Random;

/**
 * Calling customer performs request
 */
public class Customer extends Person {

    private static final Random RAND = new Random();

    public Customer(final String name) {
        super(name);
    }

    public String getRequest() {
        return name + " is calling.";
    }

    public void rate(Operator operator) {
        operator.rate(RAND.nextInt(5) + 1);
    }
}
