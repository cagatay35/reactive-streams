package org.cagatay.spring.examples.reactivestreams;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ToDoService implements IToDoService {

    @Override
    public Flux<ToDo> streamToDos() {
        return Flux.fromIterable(ToDoManager.getInstance().getToDoList());
    }

    @Override
    public Mono<ToDo> updateStatus(String taskId, ToDoStatus newStatus) {
        ToDo toDo = ToDoManager.getInstance().findToDoById(taskId);
        if (toDo != null) {
            toDo.setToDoStatus(newStatus);
            return Mono.just(toDo);
        }

        return Mono.empty();
    }

}
