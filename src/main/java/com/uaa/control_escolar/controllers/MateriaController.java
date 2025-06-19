package com.uaa.control_escolar.controllers;

import com.uaa.control_escolar.models.Materia;
import com.uaa.control_escolar.models.Profesor;
import com.uaa.control_escolar.services.MateriaService;
import com.uaa.control_escolar.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getMateria() {
        return materiaService.getMaterias();
    }

    @PostMapping
    public Materia createMateria(@RequestBody Materia materia) {
        return materiaService.createMateria(materia);
    }

    @GetMapping("/{id}")
    public Materia getMateriaById(@PathVariable Long id) {
        return materiaService.getMateriaById(id);
    }
}
