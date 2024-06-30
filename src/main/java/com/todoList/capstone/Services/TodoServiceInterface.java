package com.todoList.capstone.Services;

import com.todoList.capstone.Entity.Todo;

import java.util.List;

public interface TodoServiceInterface {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo updateTodo(Todo todo);
    Todo createTodo(Todo todo);
    void deleteTodo(Long id);

}
