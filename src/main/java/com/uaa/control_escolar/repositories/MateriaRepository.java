package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
