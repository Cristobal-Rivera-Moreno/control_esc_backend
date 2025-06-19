package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Alumno;
import com.uaa.control_escolar.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;


    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    public Alumno createAlumno(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public Alumno getAlumnoById(Long id) {
        Optional<Alumno> alumno = alumnoRepository.findById(id);
        return alumno.orElse(null);
    }
}
