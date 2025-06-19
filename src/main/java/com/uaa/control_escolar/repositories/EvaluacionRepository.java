package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}
