package com.biblioteca.prova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.prova.entities.Autor;
import com.biblioteca.prova.repository.AutorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> getAll() {
		return autorRepository.findAll();
	}
	
	public void saveAutor(Autor autor) {
		autorRepository.save(autor);
	}

}
