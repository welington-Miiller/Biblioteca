package com.biblioteca.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.prova.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {

}
