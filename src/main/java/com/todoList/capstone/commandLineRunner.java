package com.todoList.capstone;

import com.todoList.capstone.Entity.Todo;
import com.todoList.capstone.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class commandLineRunner implements CommandLineRunner {

    @Autowired
    private TodoRepository repository;
    @Override
    public void run(String... args) throws Exception {

        repository.save(new Todo(11l,"spark","very good",true,LocalDateTime.now()));


    }
}
