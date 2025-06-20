package com.uaa.control_escolar.services;

import com.uaa.control_escolar.models.Materia;
import com.uaa.control_escolar.models.Profesor;
import com.uaa.control_escolar.repositories.MateriaRepository;
import com.uaa.control_escolar.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private MateriaRepository materiaRepository;


    public List<Profesor> getProfesores() {
        return profesorRepository.findAll();
    }

    public Profesor createProfesor(Profesor profesor) {

        if (profesor.getMateria() != null) {
            Optional<Materia> materiaRepo = materiaRepository.findById(profesor.getMateria().getIdMateria());
            materiaRepo.ifPresent(profesor::setMateria);
        }

        return profesorRepository.save(profesor);
    }

    public Profesor getProfesorById(Long id) {
        Optional<Profesor> profesor = profesorRepository.findById(id);
        return profesor.orElse(null);
    }
}
