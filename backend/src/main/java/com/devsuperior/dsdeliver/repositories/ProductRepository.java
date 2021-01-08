package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dsdeliver.entities.Product;

//Serve para buscar, atualizar e deletar repositórios 
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//Ordenar os pedidos por nome
	List<Product> findAllByOrderByNameAsc();

}
