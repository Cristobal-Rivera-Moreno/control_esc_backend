package com.uaa.control_escolar.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String material;

    private String area;

    @ManyToMany
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "idMateria", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idAlumno", referencedColumnName = "id")
    )
    private List<Alumno> alumnos = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "profesor_materia",
            joinColumns = @JoinColumn(name = "idMateria", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idProfesor", referencedColumnName = "id")
    )
    private List<Profesor> profesores = new ArrayList<>();

    @OneToMany(mappedBy = "materia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluacion> evaluaciones = new ArrayList<>();


    public Materia() {

    }

    public Materia(Long id, String nombre, String material, String area) {
        this.id = id;
        this.nombre = nombre;
        this.material = material;
        this.area = area;
    }

    public Materia(List<Evaluacion> evaluaciones, List<Profesor> profesores, List<Alumno> alumnos, String area, String material, String nombre, Long id) {
        this.evaluaciones = evaluaciones;
        this.profesores = profesores;
        this.alumnos = alumnos;
        this.area = area;
        this.material = material;
        this.nombre = nombre;
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getId() {
        return id;
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
