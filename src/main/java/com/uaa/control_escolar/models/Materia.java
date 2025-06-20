package com.uaa.control_escolar.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMateria")
    private Long idMateria;
    private String nombre;
    private String material;

    private String area;


    public Materia() {

    }



    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public String getArea() {
        return area;
    }
}
