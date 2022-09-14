package com.example.todolist.Repository;

import com.example.todolist.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo,Long> {
}
