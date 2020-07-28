package com.erickalmeida.curso.repositories;

import com.erickalmeida.curso.entities.Category;
import com.erickalmeida.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Properties;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}


