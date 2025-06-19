package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Materia;
import com.uaa.control_escolar.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> getMaterias() {
        return materiaRepository.findAll();
    }

    public Materia createMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    public Materia getMateriaById(Long id) {
        Optional<Materia> materia = materiaRepository.findById(id);
        return  materia.orElse(null);
    }
}
