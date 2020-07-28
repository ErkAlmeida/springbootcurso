package com.erickalmeida.curso.resources;

import com.erickalmeida.curso.entities.Category;
import com.erickalmeida.curso.entities.User;
import com.erickalmeida.curso.services.CategoryService;
import com.erickalmeida.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categories")


public class CategoryResource {

	@Autowired  private CategoryService services;

	public CategoryResource(CategoryService services) {
		this.services = services;
	}

	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list = services.findAll();

		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){

		Category obj = services.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
