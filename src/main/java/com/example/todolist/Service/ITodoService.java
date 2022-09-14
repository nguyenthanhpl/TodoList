package com.example.todolist.Service;

import com.example.todolist.Model.Todo;
import com.example.todolist.Repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ITodoService implements TodoService{

    private ITodoRepository iTodoRepository;

    public ITodoService(ITodoRepository iTodoRepository) {
        this.iTodoRepository = iTodoRepository;
    }

    @Override
    public List<Todo> getTodos() {
        List<Todo> todos = new ArrayList<>();
        iTodoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public Todo getTodoById(Long id) {
        return iTodoRepository.findById(id).get();
    }

    @Override
    public Todo insert(Todo todo) {
        return iTodoRepository.save(todo);
    }

    @Override
    public Todo updateTodo(Long id, Todo todo) {
        Todo todoFromDb = iTodoRepository.findById(id).get();
        System.out.println(todoFromDb.toString());
        todoFromDb.setTodoStatus(todo.getTodoStatus());
        todoFromDb.setDescription(todo.getDescription());
        todoFromDb.setTitle(todo.getTitle());
        return iTodoRepository.save(todoFromDb);
    }

    @Override
    public void deleteTodo(Long todoId) {
        iTodoRepository.deleteById(todoId);
    }
}
