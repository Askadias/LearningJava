package ru.forxy.sample.callhandler;

public class ProjectManager extends Operator {

    public ProjectManager(final String name) {
        super(name, null);
        this.responsibility = Severity.HIGH;
    }
}
