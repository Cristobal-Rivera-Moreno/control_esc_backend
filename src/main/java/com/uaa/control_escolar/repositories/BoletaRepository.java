package com.uaa.control_escolar.repositories;

import com.uaa.control_escolar.models.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoletaRepository extends JpaRepository<Boleta,Long> {

}
