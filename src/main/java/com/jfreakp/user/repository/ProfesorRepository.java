package com.jfreakp.user.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.jfreakp.user.model.Profesor;

public interface ProfesorRepository extends Neo4jRepository<Profesor, String>{
	   @Query("MATCH (p:Profesor)-[r]->(o) RETURN p, r, o LIMIT 100")
	    List<Map<String, Object>> getGraphData();
}
