package com.uaa.control_escolar.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "idAlumno", referencedColumnName = "id")
    private Alumno idAlumno;
    private double promedio;

    public Boleta() {

    }

    public Boleta(Long id, LocalDateTime fecha, Alumno idAlumno, double promedio) {
        this.id = id;
        this.fecha = fecha;
        this.idAlumno = idAlumno;
        this.promedio = promedio;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
