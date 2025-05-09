package com.jfreakp.user.service;

import com.jfreakp.user.model.Alumno;
import com.jfreakp.user.model.Clase;
import com.jfreakp.user.model.Horario;
import com.jfreakp.user.model.Profesor;
import com.jfreakp.user.repository.AlumnoRepository;
import com.jfreakp.user.repository.ClaseRepository;
import com.jfreakp.user.repository.HorarioRepository;
import com.jfreakp.user.repository.ProfesorRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargaDatosService {

    @Autowired
    private ProfesorRepository profesorRepo;
    @Autowired
    private ClaseRepository claseRepo;
    @Autowired
    private AlumnoRepository alumnoRepo;
    @Autowired
    private HorarioRepository horarioRepo;

    public void cargarDatos() {
        Horario lunes9 = new Horario();
        lunes9.setId("Lunes 9 am");
        horarioRepo.save(lunes9);

        Clase mate = new Clase();
        mate.setName("Matemáticas");
        mate.setHorario(lunes9);
        claseRepo.save(mate);

        Profesor ana = new Profesor();
        ana.setName("Ana Gómez");
        ana.setClases(List.of(mate));
        profesorRepo.save(ana);

        Alumno pedro = new Alumno();
        pedro.setName("Pedro López");
        alumnoRepo.save(pedro);

        // Para vincular alumno a clase, tendrías que actualizar la relación en Clase
        mate.setAlumnos(List.of(pedro));
        claseRepo.save(mate);
    }
}
