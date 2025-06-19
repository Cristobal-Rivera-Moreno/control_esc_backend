package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Evaluacion;
import com.uaa.control_escolar.repositories.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public List<Evaluacion> getEvaluaciones() {
        return evaluacionRepository.findAll();
    }

    public Evaluacion createEvalucion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    public Evaluacion getEvaluacionById(Long id) {
        Optional<Evaluacion> ev = evaluacionRepository.findById(id);
        return ev.orElse(null);
    }
}
