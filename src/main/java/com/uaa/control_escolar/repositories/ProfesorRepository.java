package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
    @Override
    @Query("SELECT p,m FROM Profesor p JOIN p.materias m WHERE p.id = m.id")
    List<Profesor> findAll();
}
