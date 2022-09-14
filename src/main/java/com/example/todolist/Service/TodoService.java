package com.example.todolist.Service;

import com.example.todolist.Model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    Todo updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
