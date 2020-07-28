package com.erickalmeida.curso.repositories;

import com.erickalmeida.curso.entities.Category;
import com.erickalmeida.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}


