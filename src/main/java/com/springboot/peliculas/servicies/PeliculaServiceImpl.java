package com.springboot.peliculas.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.peliculas.entities.Pelicula;
import com.springboot.peliculas.repositories.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService{
	
	@Autowired
	private PeliculaRepository peliculaServicie;

	@Override
	public List<Pelicula> listarPeliculas() {
		// TODO Auto-generated method stub
		return (List<Pelicula>) peliculaServicie.findAll();
	}

}
