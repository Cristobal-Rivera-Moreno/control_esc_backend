package com.uaa.control_escolar.controllers;

import com.uaa.control_escolar.models.Boleta;
import com.uaa.control_escolar.models.Profesor;
import com.uaa.control_escolar.repositories.BoletaRepository;
import com.uaa.control_escolar.services.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boletas")
public class BoletaController {
    @Autowired
    private BoletaService boletaService;

    @GetMapping
    public List<Boleta> getBoleta() {
        return boletaService.getBoletas();
    }

    @PostMapping
    public Boleta createBoleta(@RequestBody Boleta boleta) {
        return boletaService.createBoleta(boleta);
    }

    @GetMapping("/{id}")
    public Boleta getBoletaById(@PathVariable Long id) {
        return boletaService.getBoletaById(id);
    }
}
