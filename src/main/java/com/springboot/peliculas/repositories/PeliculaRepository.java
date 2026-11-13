package com.springboot.peliculas.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.peliculas.entities.Pelicula;

public interface PeliculaRepository extends CrudRepository<Pelicula, Integer>{

}
