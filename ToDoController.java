package org.cagatay.spring.examples.reactivestreams;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/tasks")
public class ToDoController {

    private final IToDoService taskService;

    public ToDoController(IToDoService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/stream")
    public Flux<ToDo> streamToDos() {
        return taskService.streamToDos();
    }

    @PostMapping
    public ToDo add(@RequestBody CreateToDoRequest createToDoRequest) {
        return ToDoManager.getInstance().addToDo(new ToDo(null, createToDoRequest.getTitle(), createToDoRequest.getDescription(), ToDoStatus.NEW, createToDoRequest.getSeverity()));
    }

    @PutMapping
    public Mono<ToDo> update(@RequestBody UpdateToDoRequest updateToDoRequest) {
        return ToDoManager.getInstance().updateToDo(updateToDoRequest.getId(), updateToDoRequest.getToDoStatus());
    }

}


