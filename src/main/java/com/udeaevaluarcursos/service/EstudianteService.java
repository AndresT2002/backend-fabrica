package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.Estudiante;
import com.udeaevaluarcursos.model.EvaluacionMateria;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    public List<Estudiante> listEstudiantes();
    public Optional<Estudiante> getEstudianteById(int id);

    public Estudiante createEstudiante(Estudiante evaluacionMateria);
    public Estudiante deleteEstudiante(long cedula);

    public Estudiante updateEstudiante(Estudiante estudiante);
}
