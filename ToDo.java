package org.cagatay.spring.examples.reactivestreams;

public class ToDo {

    private String taskId;
    private String title;

    private String description;
    private ToDoStatus toDoStatus;

    private Severity severity;

    public ToDo(String taskId, String title, String description, ToDoStatus toDoStatus, Severity severity) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.toDoStatus = toDoStatus;
        this.severity = severity;
    }

    public String getTaskId() {
        return taskId;
    }


    public ToDoStatus getToDoStatus() {
        return toDoStatus;
    }

    public void setToDoStatus(ToDoStatus toDoStatus) {
        this.toDoStatus = toDoStatus;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

enum Severity {
    LOW, MEDIUM, HIGH, CRITICAL
}
