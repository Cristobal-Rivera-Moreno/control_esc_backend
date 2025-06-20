package com.uaa.control_escolar.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBoleta")
    private Long idBoleta;
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "id_alumno", referencedColumnName = "idAlumno")
    private Alumno alumno;
    private double promedio;
    private boolean asistencia;

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Boleta() {

    }

    public Boleta(Long id, LocalDateTime fecha, Alumno idAlumno, double promedio) {
        this.idBoleta = id;
        this.fecha = fecha;
        this.alumno = idAlumno;
        this.promedio = promedio;
    }

    public Long getIdBoleta() {
        return idBoleta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setIdBoleta(Long idBoleta) {
        this.idBoleta = idBoleta;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
