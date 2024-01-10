package org.cagatay.spring.examples.reactivestreams;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IToDoService {

    Flux<ToDo> streamToDos();

    Mono<ToDo> updateStatus(String taskId, ToDoStatus newStatus);
    // Other service methods
}