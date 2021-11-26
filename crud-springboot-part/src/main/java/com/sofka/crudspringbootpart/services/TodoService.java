package com.sofka.crudspringbootpart.services;

import com.sofka.crudspringbootpart.models.Todo;
import com.sofka.crudspringbootpart.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<Todo> list(){
        return repository.findAll();
    }

    public Todo save(Todo todo){
        return  repository.save(todo);
    }

    public Todo get(Long id){
        return repository.findById(id).orElseThrow(); //.orElsetrue significa que si el id no existe arroja una excepción
    }

    public void delete(Long id){
        repository.delete(get(id));
    }
}
