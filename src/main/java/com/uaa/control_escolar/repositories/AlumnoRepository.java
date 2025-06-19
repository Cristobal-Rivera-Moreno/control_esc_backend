package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    @Override
    @Query("SELECT a,m FROM Alumno a JOIN a.materias m WHERE a.id = m.id")
    List<Alumno> findAll();
}
