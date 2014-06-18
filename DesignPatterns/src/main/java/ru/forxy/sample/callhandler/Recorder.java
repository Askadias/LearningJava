package ru.forxy.sample.callhandler;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Recorder {

    private final Queue<Record> recordLog = new ConcurrentLinkedQueue<Record>();

    public void log(final Operator operator, final Customer customer, final String request) {
        recordLog.add(new Record(operator, customer, request));
    }

    public Queue<Record> getLog() {
        return recordLog;
    }

    static class Record {

        private final Operator responder;
        private final Customer customer;
        private final String request;

        public Record(final Operator responder, final Customer customer, final String request) {
            this.responder = responder;
            this.customer = customer;
            this.request = request;
        }

        public Operator getResponder() {
            return responder;
        }

        public Customer getCustomer() {
            return customer;
        }

        public String getRequest() {
            return request;
        }
    }
}
