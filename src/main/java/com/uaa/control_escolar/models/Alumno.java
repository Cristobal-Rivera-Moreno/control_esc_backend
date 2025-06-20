package com.uaa.control_escolar.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlumno")
    private Long idAlumno;
    private String nombre;
    private String apellido;
    private String email;
    private int tipo;
    private int edad;

    @JsonIgnore
    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluacion> evaluaciones = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_materia", referencedColumnName = "idMateria")
    private Materia materia;

    public Alumno() {

    }

    public Alumno(Long id, String nombre, String apellido) {
        this.idAlumno = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(Long id, String nombre, String apellido, String email, int tipo, int edad) {
        this.idAlumno = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }


    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}