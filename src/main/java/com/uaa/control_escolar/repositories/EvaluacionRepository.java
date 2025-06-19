package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
    @Override
    @Query("SELECT e,a FROM Evaluacion e JOIN e.alumno a WHERE e.id=a.id")
    List<Evaluacion> findAll();
}
