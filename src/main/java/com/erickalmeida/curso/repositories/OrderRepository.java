package com.erickalmeida.curso.repositories;

import com.erickalmeida.curso.entities.Order;
import com.erickalmeida.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}


