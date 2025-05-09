package com.jfreakp.user.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import lombok.Data;
import java.util.List;

@Node
@Data
public class Horario {
	@Id
    private String id; // ejemplo: "Lunes 9 am"

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
