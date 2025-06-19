package com.uaa.control_escolar.controllers;

import com.uaa.control_escolar.models.Alumno;
import com.uaa.control_escolar.models.Profesor;
import com.uaa.control_escolar.services.AlumnoService;
import com.uaa.control_escolar.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getProfesor() {
        return profesorService.getProfesores();
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.createProfesor(profesor);
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable Long id) {
        return profesorService.getProfesorById(id);
    }
}
