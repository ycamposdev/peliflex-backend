package com.springboot.peliculas.controllers;

import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.peliculas.entities.Pelicula;
import com.springboot.peliculas.servicies.PeliculaService;

@RestController
@RequestMapping("/peliflex")
public class PeliculaController {
	
	@Autowired
	private PeliculaService pservice;
	
	@GetMapping("/listarPeliculas")
	public List<Pelicula> listarPelicula(){
		return (List<Pelicula>) pservice.listarPeliculas();
	}

}
