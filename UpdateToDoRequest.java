package org.cagatay.spring.examples.reactivestreams;

public class UpdateToDoRequest {
    private String id;
    private ToDoStatus toDoStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ToDoStatus getToDoStatus() {
        return toDoStatus;
    }

    public void setToDoStatus(ToDoStatus toDoStatus) {
        this.toDoStatus = toDoStatus;
    }
}