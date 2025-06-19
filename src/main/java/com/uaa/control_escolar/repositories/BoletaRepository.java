package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoletaRepository extends JpaRepository<Boleta,Long> {

    @Override
    @Query("SELECT b,a FROM Boleta b JOIN b.alumno a WHERE a.id = b.id")
    List<Boleta> findAll();
}
