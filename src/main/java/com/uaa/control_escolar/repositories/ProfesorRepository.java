package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}
