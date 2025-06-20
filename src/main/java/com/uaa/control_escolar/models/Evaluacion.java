package com.uaa.control_escolar.models;

import jakarta.persistence.*;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEvaluacion")
    private Long idEvaluacion;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_alumno" , referencedColumnName = "idAlumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "id_materia", referencedColumnName = "idMateria")
    private Materia materia;
    private double cal1;
    private double cal2;
    private double cal3;

    public Evaluacion() {

    }

    public Evaluacion(Long id,Alumno idAlumno, Materia idMateria, double cal1, double cal2, double cal3) {
        this.idEvaluacion = id;
        this.alumno = idAlumno;
        this.materia = idMateria;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public void setCal2(double cal2) {
        this.cal2 = cal2;
    }

    public void setCal3(double cal3) {
        this.cal3 = cal3;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getCal1() {
        return cal1;
    }

    public double getCal2() {
        return cal2;
    }

    public double getCal3() {
        return cal3;
    }
}
