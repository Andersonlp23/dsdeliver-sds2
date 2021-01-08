package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.services.ProductService;


@RestController //Controlador reset
@RequestMapping (value = "/products")//Caminho do recurso
public class ProductController {
	
	@Autowired //Dependencia para o service
	private ProductService service;
	
	@GetMapping 
	public ResponseEntity<List<ProductDTO>> findall(){
		List<ProductDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	

}
