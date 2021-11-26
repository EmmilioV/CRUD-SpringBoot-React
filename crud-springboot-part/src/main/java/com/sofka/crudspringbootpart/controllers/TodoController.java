package com.sofka.crudspringbootpart.controllers;

import com.sofka.crudspringbootpart.models.Todo;
import com.sofka.crudspringbootpart.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list(){
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return  service.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId()!=null)
            return  service.save(todo);
        throw new RuntimeException("No existe el id para actualizar");
    }

    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @DeleteMapping(value = "api/{id}/delete")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }
}
