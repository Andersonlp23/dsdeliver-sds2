package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dsdeliver.entities.Order;

//Serve para buscar, atualizar e deletar repositórios 
public interface OrderRepository extends JpaRepository<Order, Long> {

}
