package com.uaa.control_escolar.controllers;

import com.uaa.control_escolar.models.Evaluacion;
import com.uaa.control_escolar.services.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluaciones")
public class EvaluacionController {
    @Autowired
    private EvaluacionService evaluacionService;

    @GetMapping
    public List<Evaluacion> getEvaluacion() {
        return evaluacionService.getEvaluaciones();
    }

    @PostMapping
    public Evaluacion createEvaluacion(@RequestBody Evaluacion evaluacion) {
        return evaluacionService.createEvaluacion(evaluacion);
    }

    @GetMapping("/{id}")
    public Evaluacion getEvaluacionById(@PathVariable Long id) {
        return evaluacionService.getEvaluacionById(id);
    }
}
