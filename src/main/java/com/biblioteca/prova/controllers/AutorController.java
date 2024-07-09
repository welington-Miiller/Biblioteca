package com.biblioteca.prova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.prova.entities.Autor;
import com.biblioteca.prova.services.AutorService;

@RestController
@RequestMapping(value="/autores")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> getAll() {
		List<Autor> lista = service.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	@PostMapping
	public ResponseEntity<String> saveAutor (@RequestBody Autor autor) {
		service.saveAutor(autor);
		return ResponseEntity.status(HttpStatus.CREATED).body("autor cadastrado");
	}

}
