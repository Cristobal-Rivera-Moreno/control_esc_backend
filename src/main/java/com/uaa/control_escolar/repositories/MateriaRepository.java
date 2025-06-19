package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
