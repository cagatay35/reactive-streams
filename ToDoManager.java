package org.cagatay.spring.examples.reactivestreams;


import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ToDoManager {

    private static ToDoManager instance;
    private final Sinks.Many<ToDo> todoSink = Sinks.many().replay().all();

    private final List<ToDo> toDoList = new ArrayList<>();

    public static synchronized ToDoManager getInstance() {
        if (instance == null) {
            instance = new ToDoManager();
            instance.addToDo(new ToDo(UUID.randomUUID().toString(), "Media API s2s integration", "Service to service k8s authorization", ToDoStatus.NEW, Severity.HIGH));
            instance.addToDo(new ToDo(UUID.randomUUID().toString(), "WarehouseEntryDate column should be refactored", "Column type should be modified as varchar(50)", ToDoStatus.NEW, Severity.HIGH));
            instance.todoSink.asFlux().share().subscribe(instance.toDoList::add);
        }
        return instance;
    }

    public ToDo addToDo(ToDo toDo) {
        toDo.setTaskId(UUID.randomUUID().toString());
        toDoList.add(toDo);
        return toDo;
    }

    public ToDo findToDoById(String taskId) {
        return toDoList.stream().filter(toDo -> toDo.getTaskId().equals(taskId)).findFirst().orElse(null);
    }

    public Sinks.Many<ToDo> getTodoSink() {
        return todoSink;
    }

    public Mono<ToDo> updateToDo(String id, ToDoStatus toDoStatus) {
        ToDo toDo = toDoList.stream().filter(t -> t.getTaskId().equals(id)).findFirst().orElse(null);
        if (toDo == null) {
            return Mono.empty();
        }
        toDo.setToDoStatus(toDoStatus);
        return Mono.just(toDo);
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }
}
