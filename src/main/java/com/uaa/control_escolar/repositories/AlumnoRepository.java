package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
