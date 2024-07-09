package com.biblioteca.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.prova.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {

}
