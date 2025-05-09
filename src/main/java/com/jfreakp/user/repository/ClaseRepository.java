package com.jfreakp.user.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.jfreakp.user.model.Clase;

public interface ClaseRepository extends Neo4jRepository<Clase, String>{

}
