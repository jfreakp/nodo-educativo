package com.jfreakp.user.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.jfreakp.user.model.Alumno;

public interface AlumnoRepository extends Neo4jRepository<Alumno, String>{

}
