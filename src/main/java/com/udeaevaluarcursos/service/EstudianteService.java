package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.Estudiante;
import com.udeaevaluarcursos.model.EvaluacionMateria;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    public List<Estudiante> listEstudiantes();
    public Estudiante getEstudianteByCedula(int cedula);

    public Estudiante createEstudiante(Estudiante estudiante);
    public Estudiante deleteEstudiante(int cedula);

    public Estudiante updateEstudiante(Estudiante estudiante);
}
