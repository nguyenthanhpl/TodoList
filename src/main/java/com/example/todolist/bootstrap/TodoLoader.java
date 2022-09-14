package com.example.todolist.bootstrap;

import com.example.todolist.Model.Todo;
import com.example.todolist.Repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;

public class TodoLoader implements CommandLineRunner {

    public final ITodoRepository iTodoRepository;

    public TodoLoader(ITodoRepository iTodoRepository) {
        this.iTodoRepository = iTodoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }

    private void loadTodos() {
        if (iTodoRepository.count() == 0) {
            iTodoRepository.save(
                    Todo.builder()
                            .title("Go to market")
                            .description("Buy eggs from market")
//                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            iTodoRepository.save(
                    Todo.builder()
                            .title("Go to school")
                            .description("Complete assignments")
//                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            System.out.println("Sample Todos Loaded");
        }
    }
}
