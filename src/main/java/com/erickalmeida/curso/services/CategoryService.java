package com.erickalmeida.curso.services;

import com.erickalmeida.curso.entities.Category;
import com.erickalmeida.curso.entities.User;
import com.erickalmeida.curso.repositories.CategoryRepository;
import com.erickalmeida.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){

        return repository.findAll();
    }

    public Category findById(Long id) {

        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
