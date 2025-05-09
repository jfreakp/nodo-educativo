package com.jfreakp.user.controller;

import org.springframework.web.bind.annotation.*;

import com.jfreakp.user.dto.GraphResponse;
import com.jfreakp.user.model.Profesor;
import com.jfreakp.user.repository.ProfesorRepository;
import com.jfreakp.user.service.CargaDatosService;
import com.jfreakp.user.service.GraphService;

import jakarta.annotation.PostConstruct;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@CrossOrigin(origins = "*")
public class ProfesorController {

	private final ProfesorRepository profesorRepo;
    private final GraphService graphService;

/*
	@PostConstruct
	public void init() {
		cargaDatosService.cargarDatos();
	}
*/
	public ProfesorController(ProfesorRepository profesorRepo, GraphService graphService) {
		this.profesorRepo = profesorRepo;
		this.graphService = graphService;
	}

	@GetMapping
	public List<Profesor> getAll() {
		return profesorRepo.findAll();
	}

	@PostMapping
	public Profesor create(@RequestBody Profesor prof) {
		return profesorRepo.save(prof);
	}
	
	@GetMapping("/graph")
    public GraphResponse getGraph() {
        return graphService.getGraph();
    }
}
