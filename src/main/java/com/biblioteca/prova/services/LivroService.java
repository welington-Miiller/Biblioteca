package com.biblioteca.prova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.prova.entities.Livro;
import com.biblioteca.prova.repository.LivroRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	public void saveLivro(Livro livro) {
		livroRepository.save(livro);
	}
}
