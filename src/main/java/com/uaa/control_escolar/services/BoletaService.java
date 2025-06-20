package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Boleta;
import com.uaa.control_escolar.models.Evaluacion;
import com.uaa.control_escolar.repositories.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;

    public List<Boleta> getBoletas() {
        return boletaRepository.findAll();
    }

    public Boleta createBoleta(Boleta boleta) {
        return boletaRepository.save(boleta);

    }

    public Boleta getBoletaById(Long id){
        Optional<Boleta> boleta = boletaRepository.findById(id);
        return boleta.orElse(null);
    }

    public Boleta getBoletaByAlumnoId(Long id){
        List<Boleta> ev = getBoletas();

        if (ev.size() > 0)
            for (Boleta e: ev){
                if (e.getAlumno().getIdAlumno() == id) return e;
            }

        return null;
    }
}
