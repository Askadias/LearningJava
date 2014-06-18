package ru.forxy.sample.callcenter;

public class TechnicalLead extends Operator {

    public TechnicalLead(final String name, ProjectManager manager) {
        super(name, manager);
        this.responsibility = Severity.MEDIUM;
    }
}
