package com.jfreakp.user.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.jfreakp.user.model.Horario;

public interface HorarioRepository extends Neo4jRepository<Horario, String>{

}
