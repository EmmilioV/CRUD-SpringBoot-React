package com.sofka.crudspringbootpart.repositories;

import com.sofka.crudspringbootpart.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
