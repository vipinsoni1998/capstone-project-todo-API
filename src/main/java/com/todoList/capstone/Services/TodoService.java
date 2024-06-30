package com.todoList.capstone.Services;


import com.todoList.capstone.Entity.Todo;
import com.todoList.capstone.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo updateTodo(Todo todo) {
        Todo existingTodo = getTodoById(todo.getId());
        if (existingTodo == null) {
            return null;
        }
        else {
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setDescription(todo.getDescription());
            existingTodo.setCompleted(todo.isCompleted());
            return todoRepository.save(existingTodo);
        }
    }
    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }
}

