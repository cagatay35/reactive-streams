# Reactive ToDo Application with Spring

## Introduction

This repository contains a sample Spring application demonstrating the implementation of reactive programming concepts using the Reactor project. The main focus is on utilizing `Flux` and `Mono` types to build a ToDo application where tasks with different statuses can be efficiently managed and updated in real-time.

## Purpose

The purpose of this project is to guide developers through the fundamentals of reactive programming with Spring. The `ToDoService` class showcases the usage of `Flux` and `Mono` for handling asynchronous flows, and the addition of a JavaScript frontend subscriber using `EventSource` illustrates practical implementation.

## Features

- **Reactive Streams:** Utilize the power of reactive streams to handle asynchronous data flows efficiently.
- **Real-time Updates:** Subscribe to real-time updates of ToDo tasks and observe changes in their statuses as they occur.
- **Status Management:** Efficiently manage and update task statuses such as "New," "In Progress," and "Completed."

## Getting Started

Follow these steps to run the application locally:

1. Clone the repository: `git clone https://github.com/yourusername/reactive-todo.git`
2. Navigate to the project directory: `cd reactive-streams`
3. Build and run the application: `./mvnw spring-boot:run`

Visit `http://localhost:8080` to interact with the ToDo application.

## Conclusion

Reactive programming, when applied with Spring's Reactor project, offers a scalable and responsive solution for managing asynchronous data. This project provides a starting point for developers to understand and implement reactive programming concepts in a real-world ToDo application scenario.

Feel free to contribute or provide feedback to enhance the functionality and features of this application.

## License

This project is licensed under the [MIT License](LICENSE).