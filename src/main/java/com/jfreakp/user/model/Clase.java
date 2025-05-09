package com.jfreakp.user.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import lombok.Data;
import java.util.List;

@Node
@Data
public class Clase {
    @Id
    private String name;

    @Relationship(type = "SE_DICTA_EN")
    private Horario horario;

    @Relationship(type = "INSCRITO_EN", direction = Relationship.Direction.INCOMING)
    private List<Alumno> alumnos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
