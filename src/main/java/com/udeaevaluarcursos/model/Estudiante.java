package com.udeaevaluarcursos.model;

import jakarta.persistence.*;

@Entity
@Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id ;

    @Column(name="cedula")
    private int cedula;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante(){

    }
}
