package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.services.OrderService;


@RestController //Controlador reset
@RequestMapping (value = "/orders")//Caminho do recurso
public class OrderController {
	
	@Autowired //Dependencia para o service
	private OrderService service;
	
	@GetMapping 
	public ResponseEntity<List<OrderDTO>> findall(){
		List<OrderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	

}
