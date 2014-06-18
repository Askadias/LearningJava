package ru.forxy.sample.callhandler;

public class TechnicalLead extends Operator {

    public TechnicalLead(final String name, ProjectManager manager) {
        super(name, manager);
        this.responsibility = Severity.MEDIUM;
    }
}
