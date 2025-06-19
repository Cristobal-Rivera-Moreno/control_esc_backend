package com.uaa.control_escolar.controllers;

import com.uaa.control_escolar.models.Alumno;
import com.uaa.control_escolar.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> getAlumnos() {
        return alumnoService.getAlumnos();
    }

    @PostMapping
    public Alumno createAlumno(@RequestBody Alumno alumno) {
        return alumnoService.createAlumno(alumno);
    }
}
