package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Evaluacion;
import com.uaa.control_escolar.repositories.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public List<Evaluacion> getEvaluaciones() {
        return evaluacionRepository.findAll();
    }

    public Evaluacion createEvaluacion(Evaluacion evaluacion) {
        if (getEvaluaciones().size() > 0) {
            for (Evaluacion ev : getEvaluaciones()) {
                if (ev.getAlumno().getIdAlumno() == evaluacion.getAlumno().getIdAlumno()) {
                    ev.setCal1(evaluacion.getCal1());
                    ev.setCal2(evaluacion.getCal2());
                    ev.setCal3(evaluacion.getCal3());
                    evaluacionRepository.save(ev);
                    return ev;
                }
            }

        }
        return evaluacionRepository.save(evaluacion);

    }

    public Evaluacion getEvaluacionById(Long id) {
        Optional<Evaluacion> ev = evaluacionRepository.findById(id);
        return ev.orElse(null);
    }

    public Evaluacion getEvaluacionByAlumnoId(Long id) {
        List<Evaluacion> ev = getEvaluaciones();

        if (ev.size() > 0)
            for (Evaluacion e: ev){
                if (e.getAlumno().getIdAlumno() == id) return e;
            }

        return null;
    }
}
